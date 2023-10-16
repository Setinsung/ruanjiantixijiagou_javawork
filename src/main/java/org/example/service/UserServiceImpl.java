package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.pojo.User;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoImpl();
    }

    public boolean register(User user) {
        boolean isFindUser = check(user);
        if(isFindUser) return false;
        return userDao.addUser(user);
    }

    public boolean check(User user) {
        User rsUser = userDao.findUserByUsername(user.getUsername());
        return rsUser != null;
    }

    public User login(String username, String password) {
        return userDao.findUserByUsernameAndPassword(username, password);
    }

}
