<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HD29QN
  Date: 2017-02-17
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cat details</title>
</head>
<body>
        <h3>Details about cat:</h3>
        <table>
            <tr>
                <td><b>Cat Name</b></td>
                <td>${catName}</td>
            </tr>
            <tr>
                <td><b>Cat Race</b></td>
                <td>${catRace}</td>
            </tr>
            <tr>
                <td><b>Cat Eye Color</b></td>
                <td>${catEyeColor}</td>
            </tr>

        </table> <br><br>

        <form:form action="/deleteCat/${catName}">
            <input type="submit" value="Delete cat"/>
        </form:form>

        <form:form action="/showCats">
            <input type="submit" value="Show cats"/>
        </form:form>

        <form:form action="/welcome">
            <input type="submit" value="Welcome page"/>
        </form:form>

</body>
</html>
