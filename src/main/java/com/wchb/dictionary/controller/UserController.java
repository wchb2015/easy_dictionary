package com.wchb.dictionary.controller;

import com.wchb.dictionary.constants.ErrorEnum;
import com.wchb.dictionary.domain.HttpResult;
import com.wchb.dictionary.domain.User;
import com.wchb.dictionary.exception.RegisterException;
import com.wchb.dictionary.utils.HttpResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpResult addUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return HttpResultUtil.error(400, bindingResult.getFieldError().getDefaultMessage());
        }
        return HttpResultUtil.success(user);
    }

    @PostMapping(value = "/update")
    public HttpResult updateUser() throws Exception {
        if (true) {
            throw new RegisterException(ErrorEnum.NO_USERNAME);
        }
        return null;
    }

    @DeleteMapping
    public HttpResult deleteUser() {
        return null;
    }

}
