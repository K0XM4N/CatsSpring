<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HD29QN
  Date: 2017-02-17
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>No cats</title>
</head>
<body>
    <h3>Actually stored cats:</h3>
    <h4>There is no cats!</h4>

    <form:form action="/add">
        <input type="submit" value="Add some cats!"/>
    </form:form> <br>

    <form:form action="/welcome">
        <input type="submit" value="Welcome page"/>
    </form:form>
</body>
</html>
