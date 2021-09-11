package com.codeup.adlister;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/practice-makes-perfect")
//@WebServlet(name = "PracticeMakesPerfectServlet", value = "/PracticeMakesPerfectServlet")
public class PracticeMakesPerfectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //TODO BELOW IS EXTRA PRACTICE THAT I AM DOING!!!!
         //think of response as what we are showing them 'the user'
        // think of request as what they 'the user' wants to see from us 'the server'
        //TODO mimic 4)
            response.setContentType("text/html");
            PrintWriter display = response.getWriter();
            display.println("\n<h2>Practice makes perfect!</h2>");

            //todo mimic 4 bonus
        String name = request.getParameter("name");//query string created
        // http://localhost:8080/practice-makes-perfect?name=kayrun

//        display.println("\n<h2>Good day,<h2> "+ name+ ", welcome to our test site!</h2>");// OPTION 1
        if (name == null){
            display.println("\n<h2>I'm sorry, you're not a valid user here!</h2>");
        } else {
            display.println("\n<h2>Welcome back <h2>"+ name + ", I hope your day has been going well!</h2>");
        }

        //todo mimic 5
        private int pageCounter;
        public void counterReset(){
            pageCounter = 0;
        }
        pageCounter++;
        PrintWriter out = response.getWriter();



        //    private int pageVisits;
//    public void init(){
//        //reset visits counter
//        pageVisits = 0;
//    }
        //        response.setContentType("text/html");
//        pageVisits++;//increments hitCount by 1 each time
//
//        PrintWriter out = response.getWriter();
//        String ourTitle = "Number of times Folk visit";
//        String docuType ="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
//        out.println(docuType +
//                "<html>\n" +
//                "<head><title>" + ourTitle + "</title><style></style></head>\n" +
//                "<body bgcolor = \"#7FFFD4\">\n" +
//                "<h1 color = \"white\" align = \"center\">" + ourTitle + "</h1>\n" +
//                "<h2 align = \"center\">" + pageVisits + "</h2>\n" +
//                "</body>"+
//                "</html>"
//        );

        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
