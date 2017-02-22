<%--
  Created by IntelliJ IDEA.
  User: HD29QN
  Date: 2017-02-16
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<head>
    <title>List of cats</title>
</head>
<body>

    <h3>Actually stored cats:</h3>
    <table border="1px solid black">
        <tr><td>Cat Name:</td></tr>
            <c:forEach var="cat" items="${cats}">
                <tr><td><a href="http://localhost:8080/catDetails/${cat}">${cat}</a></td></tr>
            </c:forEach>
    </table>

    <form:form action="/add">
        <input type="submit" value="Add more cats!"/>
    </form:form> <br>

    <form:form action="/welcome">
        <input type="submit" value="Welcome page"/>
    </form:form>
</body>
</html>
