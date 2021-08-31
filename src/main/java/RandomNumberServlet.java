import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/random") //http://localhost:8080/random
public class RandomNumberServlet extends HttpServlet {

    //default doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        int min = 50;
        int max = 100;

        //generate random in value from 50-100
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);// returns to terminal
        response.getWriter().println(random_int); //returns to url page
    }

    // ***** End of RandomNumberServlet class ****
}
