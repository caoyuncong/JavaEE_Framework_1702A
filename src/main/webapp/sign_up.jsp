<%--
    Created by mingfei.net@gmail.com
    7/10/17 16:20
    https://github.com/thu/JavaEE_Framework_1702A/
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="inc.jsp"%>
<html>
<head>
    <title>sign up page</title>
</head>
<body>
<form action="${ctx}/user/signUp" method="post">
    <input type="text" name="username" placeholder="USERNAME"><br>
    <input type="password" name="password" placeholder="PASSWORD"><br>
    <input type="submit" value="SIGN UP">
</form>
<p>${requestScope.message}</p>
</body>
</html>
