<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

            <b>Current IP = ${ipAddr}</b><br/>
            <b>Current header = ${userAgent}</b>

            <ul>
                <c:forEach var="entry" items="${idAndHeader}"> <tr><td>
                    <c:out value="${entry.key}"/></td> <td><c:out value="${entry.value}"/> </td></tr> </c:forEach>
            </ul>





</body>
</html>