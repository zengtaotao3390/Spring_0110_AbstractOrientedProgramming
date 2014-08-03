package com.peach.service;

import com.peach.dao.UserDAO;
import com.peach.model.User;
import com.peach.spring.BeanFactory;
import org.junit.Test;
import com.peach.spring.*;
/**
 * Created by y400 on 2014/8/3.
 */
public class UserServiceTest {
    @Test
    public void testAdd() throws Exception {
        BeanFactory factory = new ClassPathXmlApplicationContext();
        UserService service = (UserService) factory.getBean("userService");
        //UserDAO userDAO = (UserDAO)factory.getBean("u");
        //service.setUserDAO(userDAO);
        User u = new User();
        service.add(u);
    }

}
