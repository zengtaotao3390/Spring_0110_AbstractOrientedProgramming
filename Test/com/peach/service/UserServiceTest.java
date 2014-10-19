package com.peach.service;

import com.peach.dao.UserDAO;
import com.peach.dao.impl.UserDAOImpl;
import com.peach.model.User;
import com.peach.proxy.PerformanceHandler;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import java.lang.reflect.Proxy;

/**
 * Created by y400 on 2014/8/3.
 */

public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService service = (UserService) applicationContext.getBean("userService");
        service.add(new User());



    }

}
