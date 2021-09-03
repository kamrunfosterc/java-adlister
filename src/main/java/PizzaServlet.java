import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = 'PizzaServlet', urlPatterns = '/pizza-order')
public class PizzaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.getWriter().println();
//        boolean wasLoginError =  request.getParameter("error") != null;
//        request.setAttribute("error",wasLoginError);
//        request.getRequestDispatcher("/login.jsp").forward(request, response);
        // TODO: 9/3/21 sam walkthrough
        request.getRequestDispatcher("/partials/pizzaForm.jsp").forward(request,response);


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
////        // TODO: 9/2/21 part of 2nd option, cleaner
//        String size = request.getParameter("size");
//        String crust = request.getParameter("crust");
//        String sauce = request.getParameter("sauce");
//        String toppings = request.getParameter("toppings");
//        String address = request.getParameter("address");
//
//        System.out.println(size);
//        System.out.println(crust);
//        System.out.println(sauce);
//        System.out.println(toppings);
//        System.out.println(address);
//
////        // TODO: 9/2/21 part of 2nd option, cleaner
//        if (size == null ||crust == null||sauce == null||toppings == null||address == null) {
//            //jsp check if post request
//        }

        // TODO: 9/3/21 sam walkthrough
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String address = request.getParameter("address");
        String[] toppings = request.getParameterValues("toppings");

        System.out.println(size);
        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(Arrays.toString(toppings));// special portion
        System.out.println(address);
    }
}
