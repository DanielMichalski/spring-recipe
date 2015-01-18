<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Dodaj wiadomość</title>
</head>
<body>
<form:form method="POST" modelAttribute="message">
    <table>
        <tr>
            <td>Tytuł:</td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td>Treść:</td>
            <td><form:input path="body"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Dodaj"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
