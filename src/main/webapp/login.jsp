<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<html>

<head>



    <title>用户登录界面</title>



    <meta http-equiv="pragma" content="no-cache">

    <meta http-equiv="cache-control" content="no-cache">

    <meta http-equiv="expires" content="0">

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">

    <meta http-equiv="description" content="This is my page">

    <!--

    <link rel="stylesheet" type="text/css" href="styles.css">

    -->
</head>

<body>

<form action="login.action" method="post">

    用户名：<input type="text" name="userName"/><br/>

    密码：<input type="password" name="password"/><br/>

    <input type="submit" value="提交"/>

</form>


</body>

</html>