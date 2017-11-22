package com.wchb.dictionary.domain;

import org.hibernate.validator.constraints.NotBlank;

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

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}