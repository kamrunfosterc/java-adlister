<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/7/21
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>

<h1>Create a Product</h1>
<form method="post"  action="/product/create"">
    <label for="title">username</label>
    <input id="title" name="title" type="text">
    <br>

    <label for="description">description</label>
    <input id="description" name="description" type="text">
    <br>
</form>

</body>
</html>
