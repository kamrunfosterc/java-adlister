package dao;

import models.Product;

import java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements ProductsInterface{
    private List<Product> productsList = new ArrayList<>();

    public ListProductsDao(){
        insert(new Product(1,"hammer", "to hammer things"));
        insert(new Product(2,"screwdriver", "to handle screws"));
        insert(new Product(3,"drill", "for heavy duty"));    }
    public List<Product> all(){
        return productsList;
    };
    public void insert(Product product){
        productsList.add(product);
    };

    //adding to current list of products we call the insert method ot add to them

}
