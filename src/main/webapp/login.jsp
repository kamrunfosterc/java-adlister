
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<% request.setAttribute("username", request.getParameter("username")); %>--%>
<%--<% request.setAttribute("password", request.getParameter("password")); %>--%>
<%--<p>"username" parameter: <%= request.getParameter("username") %></p>--%>
<%--<p>"password" parameter: <%= request.getParameter("password") %></p>--%>
<%--<%! String userName = request.getParameter%>--%>
<%

    // TODO: 9/2/21 1st option,
//    if (request.getMethod().equals("POST")) {//jsp check if post request
//
//        if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
//            response.sendRedirect("/profile.jsp");
//        }
//    }
    // TODO: 9/2/21 part of 2nd option, cleaner
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String requestMethodType = request.getMethod();
    // TODO: 9/2/21 part of 2nd option, cleaner
    if (requestMethodType.equals("POST")) {//jsp check if post request

        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
//interprets java

%>

<%-- http://localhost:8080/login.jsp --%>
<html>
    <head>
        <title>Title</title>
        <jsp:include page="partial/head.jsp"/>
    </head>
    <body>
    <jsp:include page="partial/navBar.jsp"/>

        <form method="post" action="/login">
            <c:if test="${error}">
                <p>Username or password invalid</p>
            </c:if>
            <label for="username">Username</label>
            <input id="username" name="username" placeholder="Enter your username" type="text"/>
            <label for="password">Password</label>
            <input id="password" name="password" placeholder="Enter your password" type="password"/>
            <br>
            <button id="submit">Submission</button>
        </form>

<%--        //TODO initial attempt (uncomment)--%>
<%--        <c:choose>--%>
<%--            <c:when test = "${username == 'admin' && password == 'password'}">--%>
<%--                <% response.sendRedirect("/profile.jsp");%>--%>
<%--            </c:when>--%>
<%--&lt;%&ndash;            <c:otherwise>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </c:otherwise>&ndash;%&gt;--%>
<%--        </c:choose>--%>

    </body>
</html>
