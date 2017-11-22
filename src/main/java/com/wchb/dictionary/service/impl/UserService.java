package com.wchb.dictionary.service.impl;

import com.wchb.dictionary.domain.User;
import com.wchb.dictionary.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    Logger LOG = LoggerFactory.getLogger(IUserService.class);

    @Override
    public void addUser(User user) {
        LOG.info("add user ,user:{}", user);
    }
}
