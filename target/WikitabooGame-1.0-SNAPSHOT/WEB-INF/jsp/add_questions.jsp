<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wikitaboo Game</title>
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
        <h1>Add questions</h1>
        <form action="addquestions" method="POST">
            <p>Question 1:</p>
            <p>
                <label for="question"></label>
                <textarea cols="80" id="question" name="question" rows="5"></textarea>
            </p>
            <p>
                <input type="submit" value="Submit" />
            </p>
        </form>
    </body>
</html>
