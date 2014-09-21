package com.peach.service;

import com.peach.dao.UserDAO;
import com.peach.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 *
 * Created by y400 on 2014/7/31.
 */
@Component("userService")
public class UserService {

    public void add(User u) {
        this.userDAO.save(u);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name="u")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO userDAO;



}
