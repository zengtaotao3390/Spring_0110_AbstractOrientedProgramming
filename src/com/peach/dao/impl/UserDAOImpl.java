package com.peach.dao.impl;
import com.peach.dao.UserDAO;
import com.peach.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by y400 on 2014/7/31.
 */
@Component("u")
public class UserDAOImpl implements UserDAO {

    private int userId;

    @Override
    public void save(User u) {
        System.out.println("a user saved");
    }

    @PostConstruct
    public void init(){
        System.out.println("int");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory");
    }



}
