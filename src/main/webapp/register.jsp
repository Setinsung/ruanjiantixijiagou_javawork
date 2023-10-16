<%--
  Created by IntelliJ IDEA.
  User: whid
  Date: 2023-10-16
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>注册</title>
    <script>
        function validateForm() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;

            if (username === "" || password === "" || confirmPassword === "") {
                alert("请填写所有字段。");
                return false;
            }

            if (password !== confirmPassword) {
                alert("确认密码与密码不匹配。");
                return false;
            }

            return true;
        }
    </script>
</head>
<body>
<h1>注册</h1>
<form action="registerAction" method="post" onsubmit="return validateForm()">
    <label for="username">用户名:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">密码:</label>
    <input type="password" id="password" name="password" required><br><br>

    <label for="confirmPassword">确认密码:</label>
    <input type="password" id="confirmPassword" name="confirmPassword" required><br><br>

    <input type="submit" value="注册">
</form>
</body>
</html>