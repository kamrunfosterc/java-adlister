import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "adsServlet", value = "/adsServlet")
public class adsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Ad> ListOfAds = DaoFactory.getAdsDao().all();
        request.setAttribute("ads", ListOfAds);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }

}
