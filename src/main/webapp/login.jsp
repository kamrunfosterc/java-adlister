


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("username", request.getParameter("username")); %>
<% request.setAttribute("password", request.getParameter("password")); %>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <form method="post" action="login.jsp">
            <label for="username">Username</label>
            <input id="username" name="username" placeholder="Enter your username" type="text"/>
            <label for="password">Password</label>
            <input id="password" name="password" placeholder="Enter your password" type="text"/>
            <button id="submit">Submission</button>
        </form>

        <c:choose>
            <c:when test="${username == 'admin' && password == 'password'}">
                <% response.sendRedirect("/profile.jsp");%>
            </c:when>
<%--            <c:otherwise>--%>
<%--            </c:otherwise>--%>
        </c:choose>

    </body>

</html>
