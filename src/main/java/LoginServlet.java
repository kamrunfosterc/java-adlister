import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //todo exercise walkthrough
        if(request.getSession().getAttribute("user") != null){
            response.sendRedirect("/profile");
            return;
        }

//        HttpSession currentSession = request.getSession();//todo sessions and cookies lecture

//        if (request.getMethod().equalsIgnoreCase("post")) {
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            if (username.equals("admin") && password.equals("password")) {
//                currentSession.setAttribute("loggedIn", true);//todo sessions and cookies lecture globally access session
//                currentSession.setAttribute("currentUser", new User("ry", "sutton", true));
//
//                response.sendRedirect("/profile");
//            } else {
//                response.sendRedirect("/profile");
//            }
//        }
        //todo exercise walk through
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt){
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
