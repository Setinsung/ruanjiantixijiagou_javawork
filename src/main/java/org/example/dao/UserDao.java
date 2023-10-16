package org.example.dao;

import org.example.pojo.User;

public interface UserDao {
    boolean addUser(User user);
    User findUserByUsername(String username);
    User findUserByUsernameAndPassword(String username, String password);
}