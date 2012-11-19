<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wikitaboo game</title>
    </head>
    <body>
        <h1>View questions</h1>
        <p>Here are your questions:</p>

    <c:forEach var="question" items="${questions}">
        <p>${question.questionString}</p>
    </c:forEach>
</body>
</html>
