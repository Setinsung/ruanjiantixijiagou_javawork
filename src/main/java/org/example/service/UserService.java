package org.example.service;

import org.example.pojo.User;

public interface UserService {
    boolean register(User user);
    boolean check(User user);
    User login(String username, String password);
}
