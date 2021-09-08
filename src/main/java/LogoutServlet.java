import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //todo lecture
//        HttpSession currentSession = request.getSession();
//        currentSession.invalidate();// logs out of current session
//        response.sendRedirect("/login");// redirects to the login page
//    }
        //todo exercise walkthrough
        request.getSession().invalidate();
        response.sendRedirect("/login");

//        @Override
//        protected void doPost (HttpServletRequest request, HttpServletResponse response) throws
//        ServletException, IOException {
//
//        }
    }
}


