package com.example.fastec.response;

import java.io.Serializable;

public class ResponseResult implements Serializable {
    // 状态码
    private Integer state;
    // 消息
    private String message;
    // 返回对象
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(Integer state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResponseResult ok(Object data) {
        ResponseResult responseResult = new ResponseResult(0,"success",data);
        return responseResult;
    }

    public static ResponseResult error(Object data) {
        ResponseResult responseResult = new ResponseResult(-1,"error",data);
        return responseResult;
    }
}
