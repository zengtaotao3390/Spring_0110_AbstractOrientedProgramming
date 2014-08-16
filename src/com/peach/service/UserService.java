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
    private List someList;
    private Set someSet;
    private Map someMap;

    public List getSomeList() {
        return someList;
    }

    public void setSomeList(List someList) {
        this.someList = someList;
    }

    public Set getSomeSet() {
        return someSet;
    }

    public void setSomeSet(Set someSet) {
        this.someSet = someSet;
    }

    public Map getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map someMap) {
        this.someMap = someMap;
    }

    @Override
    public String toString(){
        return "someMapSize:" + someMap.size() + "someListSize:" + someList.size() + "someSetSize:" + someSet.size();
    }
}
