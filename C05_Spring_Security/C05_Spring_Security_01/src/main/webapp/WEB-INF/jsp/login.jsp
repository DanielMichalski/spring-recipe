<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Zaloguj się</title>
</head>
<body>

<c:if test="${not empty param.error}">
    <p style="color: red">
        Błąd logowaniea. <br/>
        Przyczyna: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
    </p>
</c:if>

<form method="post" action="<c:url value="/j_spring_security_check" />">
    <table>
        <tr>
            <td align="right">
                <label for="username">Nazwa użytkownika</label>
            </td>
            <td><input type="text" name="j_username" id="username"/></td>
        </tr>
        <tr>
            <td align="right">
                <label for="password">Hasło</label></td>
            <td><input type="password" name="j_password" id="password"/></td>
        </tr>
        <tr>
            <td align="right">
                <label for="remember-me">Zapamiętaj mnie</label>
            </td>
            <td><input type="checkbox" name="_spring_security_remember_me" id="remember-me"></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <input type="submit" value="Zaloguj"/>
                <input type="reset" value="Resetowanie"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
