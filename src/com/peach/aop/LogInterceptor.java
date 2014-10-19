package com.peach.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by y400 on 2014/10/19.
 */
//@Aspect
@Component
public class LogInterceptor {

   // @Before("execution(public void com.peach.dao.impl.UserDAOImpl.save(com.peach.model.User))")


    //@Pointcut("execution(public * com.peach.service..*.*(..))")
    public void myMethod(){}


   // @Before("myMethod()")
    public void mothodStrat(){
        System.out.println("mothod start    now time is " + new Date());
    }

}
