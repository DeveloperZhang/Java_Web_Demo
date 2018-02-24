<%--
  Created by IntelliJ IDEA.
  User: Vicent
  Date: 2018/2/24
  Time: 下午4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello Struts Title</title>
  </head>
  <body>
  Hello Struts
  <form action="/login.do">
    <input type="text" placeholder="用户名" name="userName"/>
    <input type="text" placeholder="密码" name="password"/>
    <input type="submit" title="提交">
  </form>
  </body>
</html>
