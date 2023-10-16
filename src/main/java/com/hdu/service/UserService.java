package com.hdu.service;

import com.hdu.pojo.User;

public interface UserService {
    boolean register(User user);
    boolean check(User user);
    User login(String username, String password);
}
