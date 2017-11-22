package com.wchb.dictionary.constants;


public enum ErrorEnum {

    UNKNOW(-1, "未知错误"),
    NO_USERNAME(1, "用户名不能为空!");

    private Integer code;

    private String msg;

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
