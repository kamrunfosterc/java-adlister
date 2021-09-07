package dao;

public class DaoFactory {
                        //productsDao is a list
    private static ProductsInterface productsDao;

    public static ProductsInterface getProductsDao(){
        //check to see if a products DAO already exist
        if (productsDao == null){
            //if productsDao is null its bc it hasn't been
            //initialized, so we need to initialize it
            productsDao = new ListProductsDao();
        }
        return productsDao;
    }
}
