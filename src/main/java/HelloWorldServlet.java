import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//comment out the appropriate url pattern depending on what part of code we running
//@WebServlet(urlPatterns = "/hello-world") //http://localhost:8080/hello-world  4.) HELLO WORLD EXERCISE
@WebServlet(urlPatterns = "/count-that") //http://localhost:8080/count-that  5.) COUNT VISITS EXERCISE
public class HelloWorldServlet extends HttpServlet {

    //TODO 4.) Hello World Exercise part 4
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
////        out.println("<h1>Hello, World!<h1>");//initial hello world exercise message printed
//
//        String name = req.getParameter("name");
//        out.println("<h1>Hello,<h1> "+ name + " World!<h1>");
//    }
    //TODO 5.) page view counter (comment out others do run this)
    private int pageVisits;
    public void init(){
        //reset visits counter
        pageVisits = 0;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        pageVisits++;//increments hitCount by 1 each time

        PrintWriter out = response.getWriter();
        String ourTitle = "Number of times Folk visit";
        String docuType ="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
        out.println(docuType +
                "<html>\n" +
                "<head><title>" + ourTitle + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + ourTitle + "</h1>\n" +
                "<h2 align = \"center\">" + pageVisits + "</h2>\n" +
                "</body>"+
                "</html>"
        );

        // TODO Bonus (comment out others do run this)


    }



    // ***** End of HelloWorld Servlet Exercise *****
}
