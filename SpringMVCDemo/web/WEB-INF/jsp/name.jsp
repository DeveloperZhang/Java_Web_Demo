<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/3/28
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body>
    <input type="button" id="btn" value="ajax request" />

    <script>
        $("#btn").click(function () {
            $.get("/getPerson?name1=123",function (data) {
                alert(data);
            });
        });
    </script>
</body>
</html>
