package com.wchb.dictionary.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {

    /**
     * 用sl4j, 底层实现是logback
     */
    private final static Logger LOG = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.wchb.dictionary.controller.*.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        //URL method ip 类方法 参数
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = requestAttributes.getRequest();

        LOG.info("method={},ip={},class_method={},args={},url={}",
                request.getMethod(),
                request.getRemoteAddr(),
                joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(),
                joinPoint.getArgs(),
                request.getRequestURL());
    }

    @After("log()")
    public void doAfter() {
//        LOG.info("2222");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        LOG.info("response={}", object);
    }
}
