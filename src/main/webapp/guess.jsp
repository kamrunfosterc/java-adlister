<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/3/21
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--todo walkthrough--%>
<form action="/guess" method="post">
    <input type="number" min="1" max="3" name="guessed_number">
    <input type="submit">
</form>

</body>
</html>
