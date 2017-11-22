package com.wchb.dictionary.handle;

import com.wchb.dictionary.aspect.HttpAspect;
import com.wchb.dictionary.domain.HttpResult;
import com.wchb.dictionary.exception.RegisterException;
import com.wchb.dictionary.utils.HttpResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOG = LoggerFactory.getLogger(HttpAspect.class);

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public HttpResult handle(Exception e) {
        if (e instanceof RegisterException) {
            return HttpResultUtil.error(((RegisterException) e).getCode(), e.getMessage());
        }
        LOG.error(" system error ", e);
        return HttpResultUtil.error(500, e.getMessage());
    }
}
