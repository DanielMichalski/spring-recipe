<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Lista wiadomosci</title>
</head>
<body>

<h2>Witaj <security:authentication property="name"/>!</h2>

<security:authentication property="authorities" var="authorities"/>
<ul>
    <c:forEach items="${authorities}" var="authority">
        <li>${authority.authority}</li>
    </c:forEach>
</ul>

<a href="<c:url value="/login"/>">Zaloguj się</a>

<br />

<security:authorize ifAnyGranted="ROLE_ADMIN,ROLE_USER">
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
</security:authorize>

<a href="messagePost.htm">Zamieść wiadomość</a>

</body>
</html>
