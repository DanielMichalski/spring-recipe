<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Distance between cities</title>
</head>
<body>
<form method="POST">
    <table>
        <tr>
            <td><label for="srcCity">Source city</label></td>
            <td><input type="text" id="srcCity" name="srcCity" value="${param.srcCity}"/></td>
        </tr>
        <tr>
            <td><label for="destCity">Destination city</label></td>
            <td><input type="text" id="destCity" name="destCity" value="${param.destCity}"/></td>
        </tr>
        <tr>
            <td>Distance</td>
            <td>${distance}</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Find"/></td>
        </tr>
    </table>
</form>
</body>
</html>
