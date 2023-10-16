package com.hdu.dao;

import com.hdu.pojo.User;

public interface UserDao {
    boolean addUser(User user);
    User findUserByUsername(String username);
    User findUserByUsernameAndPassword(String username, String password);
}