import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/ads")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean wasLoginError =  request.getParameter("error") != null;
        request.setAttribute("error",wasLoginError);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // TODO: 9/2/21 part of 2nd option, cleaner
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String requestMethodType = request.getMethod();
        // TODO: 9/2/21 part of 2nd option, cleaner
        if (requestMethodType.equals("POST")) {//jsp check if post request

            if (username.equals("admin") && password.equals("lion2323")) {
                response.sendRedirect("/profile.jsp");
            } else {
//                response.sendRedirect("/login"); // option 1
                response.sendRedirect("/login?error=true");// option 2
            }
        }
    }
