package com.peach.dao.impl;
import com.peach.dao.UserDAO;
import com.peach.model.User;

/**
 * Created by y400 on 2014/7/31.
 */
public class UserDAOImpl implements UserDAO {

    private int userId;

    @Override
    public void save(User u) {
        System.out.println("a user saved");
    }


}
