<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Lista wiadomosci</title>
</head>
<body>

<a href="<c:url value="/login"/>">Zaloguj się</a>

<br />

<c:forEach items="${messages}" var="message">
    <table>
        <tr>
            <td>Autor</td>
            <td>${message.author}</td>
        </tr>
        <tr>
            <td>Tytuł</td>
            <td>${message.title}</td>
        </tr>
        <tr>
            <td>Treść</td>
            <td>${message.body}</td>
        </tr>
        <tr>
            <td colspan="2">
                <a href="messageDelete?messageId=${message.id}">Usuń</a>
            </td>
        </tr>
    </table>
    <hr />
</c:forEach>

<a href="messagePost.htm">Zamieść wiadomość</a>

</body>
</html>
