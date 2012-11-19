<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wikitaboo Game</title>
    </head>
    <body>
        <h1>Add questions</h1>
        <form action="addquestions" method="POST">
            <p>Question 1:</p>
            <p>
                <label for="question"></label>
                <textarea cols="80" id="topic" name="topic" rows="5"></textarea>
            </p>
            <p>
                <input type="submit" value="Submit" />
            </p>
        </form>
    </body>
</html>
