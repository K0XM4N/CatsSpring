<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HD29QN
  Date: 2017-02-17
  Time: 08:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/add" modelAttribute="form" method="post">

    <form:input path="catName" placeholder="Cat name" id="catName"></form:input>
    <form:errors path="catName" cssclass="error" />
    <br />

    <form:input path="race" placeholder="Cat race" id="race"></form:input>
    <form:errors path="race" cssClass="error"></form:errors>
    <br>

    <form:input path="catEyeColor" placeholder="Cat eye color" id="catEyeColor"></form:input>
    <form:errors path="catEyeColor" cssClass="error"></form:errors>
    <br>

    <input type="submit" value="Send" />
    <br><br>
    ${feedback}
</form:form>

<form:form action="/showCats">
    <input type="submit" value="Show cats"/>
</form:form>

<form:form action="/welcome">
    <input type="submit" value="Welcome page"/>
</form:form>
</body>
</html>
