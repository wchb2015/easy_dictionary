package com.wchb.dictionary.domain;

import lombok.Data;

/**
 * HTTP 响应结果
 */
@Data
public class HttpResult<T> {

    private Integer code;

    private String msg;

    /**
     * 具体的内容
     */
    private T data;

    public HttpResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}