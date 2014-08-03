package com.peach.service;

import com.peach.dao.UserDAO;
import com.peach.dao.impl.UserDAOImpl;
import com.peach.model.User;

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

    public UserDAO userDAO = new UserDAOImpl();


}
