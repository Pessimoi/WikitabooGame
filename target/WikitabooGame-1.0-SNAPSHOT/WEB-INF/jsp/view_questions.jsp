<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wikitaboo game</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
    </head>
    <body>
        <h1>Markov Chains</h1>
        <pre>
"The simplest Markov model is the Markov chain. It models the state of a system 
with a random variable that changes through time. In this context, the Markov 
property suggests that the distribution for this variable depends only on the 
distribution of the previous state. An example use of a Markov chain is Markov 
Chain Monte Carlo, which uses the Markov property to prove that a particular 
method for performing a random walk will sample from the joint distribution of 
a system." -Wikipedia 
        </pre>
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
    <h2>All questions and answers sorted by rank:</h2>
    <c:forEach var="question" items="${questions}">
        <h3>Question: ${question.questionString}</h3>
        <c:forEach var="answer" items="${question.answerList}">
            <p>Answers to the question: ${answer.answerString}</p>
        </c:forEach>
    </c:forEach>

</body>
</html>
