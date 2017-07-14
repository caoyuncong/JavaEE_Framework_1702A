<%--
    Created by mingfei.net@gmail.com
    7/11/17 10:59
    https://github.com/thu/JavaEE_Framework_1702A/
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>主页</h1>
${sessionScope.user.username}
<p><a href="/user/signOut">注销</a></p>
<hr>
</body>
</html>
