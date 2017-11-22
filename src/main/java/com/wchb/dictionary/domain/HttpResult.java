package com.wchb.dictionary.domain;

import lombok.Data;

@Data
public class HttpResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public HttpResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}