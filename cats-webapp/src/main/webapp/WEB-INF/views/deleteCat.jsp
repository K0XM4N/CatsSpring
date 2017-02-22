<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HD29QN
  Date: 2017-02-21
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete cat</title>
</head>
<body>
    <h3><strong>${deletedCats}</strong></h3> <br>

    <form:form action="/showCats">
        <input type="submit" value="Show cats"/>
    </form:form> <br>

    <form:form action="/welcome">
        <input type="submit" value="Welcome page"/>
    </form:form>
</body>
</html>
