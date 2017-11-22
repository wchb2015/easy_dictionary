package com.wchb.dictionary.constants;

import lombok.Getter;

@Getter
public enum ErrorEnum {

    UNKNOWN(-1, "未知错误"),
    NO_USERNAME(1, "用户名不能为空!");

    private Integer code;

    private String msg;

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
