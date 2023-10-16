package org.example.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    private String username;
    private String password;
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public void validate() {
        if (username == null || username.trim().isEmpty()) {
            addFieldError("username", "The username cannot be empty.");
        }

        if (password == null || password.trim().isEmpty()) {
            addFieldError("password", "The password cannot be empty.");
        }

        if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
            addFieldError("confirmPassword", "The confirmation password cannot be empty.");
        }

        if (!password.equals(confirmPassword)) {
            addFieldError("confirmPassword", "The confirmation password does not match the password.");
        }
    }


    public String execute() {
        if (hasErrors()) {
            return ERROR; // 验证失败，跳转到注册失败界面
        } else {
            return SUCCESS; // 验证通过，跳转到注册成功界面
        }
    }
}
