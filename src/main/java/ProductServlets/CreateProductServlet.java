package ProductServlets;

import dao.DaoFactory;
import dao.ProductsInterface;
import models.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateProductServlet", value = "/product/create")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/product/create.jsp").forward(request, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductsInterface productDao = DaoFactory.getProductsDao();
        Product productToAdd = new Product();
//        Product altWay = new Product(productId, productTitle, productDesc);

        String productTitle = request.getParameter("title");
        String productDesc = request.getParameter("description");
        int productId = productDao.all().size();

        productToAdd.setTitle(productTitle);
        productToAdd.setDescription(productDesc);
        productToAdd.setId(productId);

        productDao.insert(productToAdd);

        response.sendRedirect("/products/all");

    }


}
