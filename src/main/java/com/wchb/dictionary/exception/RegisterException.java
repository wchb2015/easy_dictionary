package com.wchb.dictionary.exception;


import com.wchb.dictionary.constants.ErrorEnum;

public class RegisterException extends RuntimeException {
    private Integer code;

    public RegisterException(ErrorEnum errorEnum) {
        super(errorEnum.getMsg());
        this.code = errorEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
