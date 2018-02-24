<%--
  Created by IntelliJ IDEA.
  User: Vicent
  Date: 2018/2/24
  Time: 下午6:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:property value="num1"></s:property>
    <s:property value="cal"></s:property>
    <s:property value="num2"></s:property>
    =<%=session.getAttribute("num3")%>
</body>
</html>
