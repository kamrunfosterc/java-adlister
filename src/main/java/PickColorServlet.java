import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", value = "/PickColor")
public class PickColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: 9/3/21 walkthrough
        request.getRequestDispatcher("/pickColor.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: 9/3/21 walkthrough
        String userPickedColor = request.getParameter("usersColor");

        response.sendRedirect("show-color?usersColor="+userPickedColor);

    }
}
