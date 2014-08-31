package com.peach.service;

import com.peach.model.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by y400 on 2014/8/3.
 */
public class UserServiceTest {

    @Test
    public void testAdd() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) applicationContext.getBean("userService");
        System.out.println(service.getUserDAO());
    }

}
