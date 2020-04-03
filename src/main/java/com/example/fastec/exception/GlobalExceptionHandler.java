package com.example.fastec.exception;

import com.example.fastec.response.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseResult globalException(HttpServletResponse response, Exception ex) {
        logger.info("错误代码：" + response.getStatus());
        ResponseResult responseResult = new ResponseResult();
        responseResult.setState(-1);
        responseResult.setMessage(ex.getMessage());
        responseResult.setData(null);
        return responseResult;
    }
}
