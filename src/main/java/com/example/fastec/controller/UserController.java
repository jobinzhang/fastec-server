package com.example.fastec.controller;

import com.example.fastec.bean.User;
import com.example.fastec.bean.UserFollow;
import com.example.fastec.response.ResponseModel;
import com.example.fastec.response.UserCard;
import com.example.fastec.service.UserFollowSevice;
import com.example.fastec.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;
    @Resource
    private UserFollowSevice userFollowSevice;
    @Autowired(required = false)
    HttpServletRequest request;

    /*// fastec登录用
    @PostMapping("/login")
    public ResponseResult login(@RequestBody UserLoginParam userLoginParam) {
        User user = userService.login(userLoginParam);
        return ResponseResult.ok(user);
    }

    // fastec注册用
    @PostMapping("/register")
    public ResponseResult register(@RequestBody UserRegisterParam userRegisterParam) throws Exception {
        User user = userService.register(userRegisterParam);
        return ResponseResult.ok(user);
    }*/

    // 拉取指定用户id的关注列表
    @GetMapping("/contact/{user_id}")
    public ResponseModel<List<UserCard>> contact(@PathVariable("user_id") int userId) {
        // 拿到我的联系人
        List<UserFollow> userFollows = userFollowSevice.listUserFollowByOriginUid(userId);

        // 转换为UserCard
        List<UserCard> userCards = userFollows.stream().map(userFollow -> userService.getUserByUid(userFollow.getTargetUserId())).
                filter(user -> user!= null).map(user -> new UserCard(user, true)).collect(Collectors.toList());
        // 返回
        return ResponseModel.buildOk(userCards);
    }

    // 关注人，
    @PostMapping("/follow/{target_user_id}")
    public ResponseModel<UserCard> follow(@PathVariable("target_user_id") int targetUid) {
        int selfUid = request.getIntHeader("self_uid");
        // 自己不能关注自己
        if (selfUid == targetUid) {
            // 返回参数异常
            return ResponseModel.buildParameterError();
        }
        User targetUser = userService.getUserByUid(targetUid);
        if (targetUser == null) {
            // 未找到人
            return ResponseModel.buildNotFoundUserError(null);
        }
        boolean isFollowSuccess = userFollowSevice.follow(selfUid, targetUid);
        if (! isFollowSuccess ) {
            // 关注失败，返回服务器异常
            return ResponseModel.buildServiceError();
        }
        // TODO 通知我关注的人我关注他
        // 返回关注的人的信息
        return ResponseModel.buildOk(new UserCard(targetUser, true));
    }

    // 获取某人的信息
    @GetMapping("/{uid}")
    public ResponseModel<UserCard> getUser(@PathVariable("uid") int uid) {
        if (uid <= 0) {
            // 返回参数异常
            return ResponseModel.buildParameterError();
        }
        User user = userService.getUserByUid(uid);
        if (user == null) {
            // 没找到，返回没找到用户
            return ResponseModel.buildNotFoundUserError(null);
        }
        return ResponseModel.buildOk(new UserCard(user, true));
    }

    // 搜索人的接口实现
    @GetMapping("/search/{name}")
    public ResponseModel<List<UserCard>> search(@PathVariable("name") String name) {
        int selfUid = request.getIntHeader("self_uid");
        // 获取当前用户的关注列表
        List<UserFollow> userFollows = userFollowSevice.listUserFollowByOriginUid(selfUid);
        List<User> searchUsers = userService.searchUserByName(name);
        List<UserCard> userCards = searchUsers.stream().map(user -> {
                boolean isFollow = userFollows.stream().anyMatch(userfollow -> userfollow.getTargetUserId() == user.getId());
                return new UserCard(user, isFollow);
        }).collect(Collectors.toList());

        return ResponseModel.buildOk(userCards);
    }
}
