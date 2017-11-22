package com.wchb.dictionary.controller;

import com.wchb.dictionary.domain.HttpResult;
import com.wchb.dictionary.mapper.FutureDailyPriceDao;
import com.wchb.dictionary.utils.HttpResultUtil;
import com.wchb.dictionary.utils.SinaPriceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackDoorController {

    @Autowired
    private FutureDailyPriceDao priceDao;

    @GetMapping(value = "/future/{contractName}")
    public HttpResult get(@PathVariable String contractName) {
        return HttpResultUtil.success(SinaPriceUtil.getDailyPrice(contractName));
    }

    @GetMapping(value = "/future/save")
    public HttpResult save() {
        priceDao.insertFutureDailyPrice(SinaPriceUtil.getDailyPrice("P1805"));
        return HttpResultUtil.success(null);
    }

}
