<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HD29QN
  Date: 2017-02-16
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cats Database</title>
</head>
<body>
    <h1>Hello World. This is Spring Tutorial</h1>

    <strong>${message}</strong>

    <form:form action="/showCats">
        <input type="submit" value="Show cats"/>
    </form:form>

    <form:form action="/add" modelAttribute="form" method="get">
        <input type="submit" value="Add cats"/>
    </form:form>
</body>
</html>
