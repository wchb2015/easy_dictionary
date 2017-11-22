package com.wchb.dictionary.service.impl;

import com.wchb.dictionary.domain.User;
import com.wchb.dictionary.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private IUserService userService;

    @Test
    public void addUser() throws Exception {
        userService.addUser(User.newUser().userName("haha"));
    }

}