package com.hdu.service;

import com.hdu.dao.UserDao;
import com.hdu.dao.UserDaoImpl;
import com.hdu.pojo.User;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoImpl();
    }

    @Override
    public boolean register(User user) {
        boolean isFindUser = check(user);
        if(isFindUser) return false;
        return userDao.addUser(user);
    }

    @Override
    public boolean check(User user) {
        User rsUser = userDao.findUserByUsername(user.getUsername());
        return rsUser != null;
    }

    @Override
    public User login(String username, String password) {
        return userDao.findUserByUsernameAndPassword(username, password);
    }

}
