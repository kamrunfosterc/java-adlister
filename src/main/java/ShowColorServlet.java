import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShowColorServlet", value = "/show-color")
public class ShowColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO: 9/3/21 walkthrough
        String userColor = request.getParameter("/userColor");
        request.setAttribute("color", userColor);

        request.getRequestDispatcher("/showColor.jsp").forward(request,response);
    }

}
