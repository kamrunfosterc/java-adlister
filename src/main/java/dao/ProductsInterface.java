package dao;

import models.Product;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ProductsInterface {

    List<Product> all();// returns all of the products
    void insert(Product product);// takes in a product which we are calling product



}
