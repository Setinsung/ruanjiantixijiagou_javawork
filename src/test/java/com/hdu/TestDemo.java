package com.hdu;

import org.junit.Assert;
import org.junit.Test;

import com.hdu.pojo.User;
import com.hdu.service.UserService;
import com.hdu.service.UserServiceImpl;

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
