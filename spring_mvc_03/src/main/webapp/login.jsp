<%--
  Created by IntelliJ IDEA.
  User: echo lovely
  Date: 2020/9/7
  Time: 19:21
  用户登录页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
</head>
<body>

    <form action="user/login" method="post">
        用户名：<input type="text" name="userName"/> <br/>
        密码：<input type="password" name="password"/> <br/>
        <input type="submit" value="login"/>
    </form>

</body>
</html>
