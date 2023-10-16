package org.example;

import org.junit.Assert;
import org.junit.Test;

import org.example.pojo.User;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

public class TestDemo {
    public static UserService userService = new UserServiceImpl();
    @Test
    public void testRegister(){
        boolean rs = userService.register(new User(10, "wtf", "114514"));
        Assert.assertTrue(rs);
    }

    @Test
    public void testCheck(){
        User user = new User(10, "wtf", "114514");
        boolean rs = userService.check(user);
        Assert.assertTrue(rs);
    }

    @Test
    public void testLogin(){
        User user = userService.login("wtf", "114514");
        Assert.assertNotNull(user);
    }
}
