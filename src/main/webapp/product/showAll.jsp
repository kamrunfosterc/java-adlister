<%--
  Created by IntelliJ IDEA.
  User: thelibrarian
  Date: 9/7/21
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>All Products</title>
</head>
<body>
<c:forEach var="singleProduct" items="${listOfProducts}">
    <div class="item">
        <h3>${singleProduct.id}</h3>
        <p>${singleProduct.title}</p>
        <p>${singleProduct.description}</p>
    </div>
</c:forEach>

</body>
</html>
