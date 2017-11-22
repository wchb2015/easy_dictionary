package com.wchb.dictionary.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@ToString
public class User {

    private Long id;

    @NotBlank(message = "请输入用户名")
    private String userName;

    @NotBlank(message = "请输入email")
    private String email;

    @NotBlank(message = "请输入手机号")
    private String mobile;


    private User() {
    }

    public static User newUser() {
        return new User();
    }

    public User id(Long id) throws IllegalStateException {
        this.id = id;
        return this;
    }

    public User userName(String userName) throws IllegalStateException {
        this.userName = userName;
        return this;
    }

    public User email(String email) throws IllegalStateException {
        this.email = email;
        return this;
    }

    public User mobile(String mobile) throws IllegalStateException {
        this.mobile = mobile;
        return this;
    }

}