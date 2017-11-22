package com.wchb.dictionary.exception;


import com.wchb.dictionary.constants.ErrorEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterException extends RuntimeException {
    private Integer code;

    public RegisterException(ErrorEnum errorEnum) {
        super(errorEnum.getMsg());
        this.code = errorEnum.getCode();
    }

}
