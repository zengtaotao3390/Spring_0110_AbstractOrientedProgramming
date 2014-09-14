package com.peach.service;

import com.peach.dao.UserDAO;
import com.peach.model.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by y400 on 2014/7/31.
 */
public class UserService {

    public void add(User u){this.userDAO.save(u);};

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO userDAO;

    public void  init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destory");
    }


}
