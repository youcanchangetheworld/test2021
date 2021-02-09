<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>"/>
</head>

<body>
    <div align="center">
        <form action="user/login" method="post">
            <input type="text" required name="username" id="username" placeholder="输入用户名" /><br>
            <input type="password" required name="password" id="password" placeholder="输入密码" /><br>
            <input type="submit" value="login" align="center">
        </form>
    </div>

</body>