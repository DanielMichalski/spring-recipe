<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>Distance between cities</title>
</head>
<body>
<html:form method="POST" action="/distance.do">
    <table>
        <tr>
            <td>Source city</td>
            <td><html:text property="srcCity"/></td>
        </tr>
        <tr>
            <td>Destination city</td>
            <td><html:text property="destCity"</td>
        </tr>
        <tr>
            <td>Distance</td>
            <td>${distance}</td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Find"/></td>
        </tr>
    </table>
</html:form>
</body>
</html>
