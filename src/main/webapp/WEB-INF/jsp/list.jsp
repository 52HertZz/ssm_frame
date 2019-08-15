<%--
  Created by IntelliJ IDEA.
  User: lh141
  Date: 2019/8/15
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有账户信息成功</h3>
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money}
    </c:forEach>
</body>
</html>
