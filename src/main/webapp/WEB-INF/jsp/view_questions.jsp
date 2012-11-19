<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wikitaboo game</title>
    </head>
    <body>
        <h1>View questions</h1>
        <p>Here are your questions:</p>

        <p>
            <c:forEach var="question" items="${questions}">
            <p>${question.questionString}</p>
            <form action="addanswer" method="POST">
                <p>Answer to question:</p>
                <p>
                    <textarea cols="80" id="answer" name="answer" rows="5"></textarea>
                </p>
                <p>
                    <input type="hidden" id="questionid" name="questionid" value=${question.id}>
                    <input type="submit" value="Submit" />
                </p>
            </form>
        </c:forEach>
    </p>
    <p>All questions and answers sorted by rank:</p>
    <c:forEach var="question" items="${questions}">
        <p>Question: ${question.questionString}</p>
        <c:forEach var="answer" items="${question.answerList}">
            <p>Answers to the question: ${answer.answerString}</p>
        </c:forEach>
    </c:forEach>
</body>
</html>
