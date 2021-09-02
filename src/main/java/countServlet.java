import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "countServlet", urlPatterns = "/count")
public class countServlet extends  HttpServlet{
    //TODO walk through
    int timesVisited = 0;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String reset = request.getParameter("reset");
        timesVisited++;

        //TODO bonus
        if (reset != null && reset.equals("letsreset")){
            timesVisited = 0;
        }
        out.println(timesVisited);
    }


}
