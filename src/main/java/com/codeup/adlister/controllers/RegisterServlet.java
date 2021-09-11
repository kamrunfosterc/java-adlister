package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile

        //grabbing input from form... need to create register.jsp
        String username = request.getParameter("username");//get parameters based on name
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirm = request.getParameter("password_confirm");

        //need to validate and make sure is good
        boolean inputHasErrors = username.isEmpty()
                || email.isEmpty()
                || password.isEmpty()
                || (!password.equals(confirm));

        //if one of above conditions not met
        if (inputHasErrors) {
            response.sendRedirect("/register");
            return;
        }

//        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());// moved to user.java
        //common practice could be to set it model User class setPassword() method

        System.out.println(hashedPassword);

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);//old way... also best after moving hashedPass to user.java
//        user.setPassword(hashedPassword);// be careful bc could hash a already hashed pass and things get complicated

        DaoFactory.getUsersDao().insert(user);// important part
        response.sendRedirect("/login");
    }
}
