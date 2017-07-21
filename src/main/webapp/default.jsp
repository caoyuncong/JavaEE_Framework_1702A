<%--
    Created by mingfei.net@gmail.com
    7/4/17 16:19
    https://github.com/thu/JavaEE_Framework_1702A/
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="commons/inc.jsp"%>
<html>
<head>
    <title>default page</title>
    <link href="css/style.css">
</head>
<body>
<h1>首页</h1>
<form action="${ctx}/user/signIn" method="post">
    <input type="text" name="username" placeholder="USERNAME" value="Tom"><br>
    <input type="password" name="password" placeholder="PASSWORD" value="123"><br>
    <input type="submit" value="SIGN IN">
</form>
<p>${requestScope.message}</p>
<a href="${ctx}/sign_up.jsp">SIGN UP</a>
</body>
</html>
