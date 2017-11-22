package com.wchb.dictionary.controller;

import com.wchb.dictionary.domain.HttpResult;
import com.wchb.dictionary.mapper.FutureDailyPriceDao;
import com.wchb.dictionary.utils.HttpResultUtil;
import com.wchb.dictionary.utils.SinaPriceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class BackDoorController {

    @Autowired
    private FutureDailyPriceDao priceDao;

    @GetMapping(value = "/future/{contractName}")
    public HttpResult get(@PathVariable String contractName) {
        return HttpResultUtil.success(SinaPriceUtil.getDailyPrice(contractName));
    }

    @GetMapping(value = "/future/save/{contractName}")
    public HttpResult save(@PathVariable String contractName) {
        if (Objects.isNull(contractName) || contractName.trim().length() == 0) {
            throw new IllegalArgumentException("contractName should not be empty!");
        }
        priceDao.insertFutureDailyPrice(SinaPriceUtil.getDailyPrice(contractName));
        return HttpResultUtil.success(null);
    }

}
