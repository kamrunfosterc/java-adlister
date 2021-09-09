import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class MySQLAdsDao implements Ads {


    private Connection connection;//private instance property

    public MySQLAdsDao() {// throws SQLException substituted with the try catch
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();//alt could've passed Config config in parameter ()
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // using connection make queries that grabs ads result
    // TODO: 9/9/21  
    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> adsList = new ArrayList<>();
        Statement statement = connection.createStatement();
        String selectQuery = "SELECT * FROM ads";
        ResultSet rs = statement.executeQuery(selectQuery);

        while (rs.next()) {
            adsList.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("description")
            ));
        }
        return adsList;
    }

    @Override
    public Long insert(Ad ad)  {//throws SQLException
        System.out.println(ad);
        String query = "INSERT INTO ads (user_id, title, description) " +
                "VALUES(" + ad.getUserId() + ", '" + ad.getTitle() + "' , '" + ad.getDescription() + "')";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
                return rs.getLong(1);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;// returns if something went wrong when we inserted
    }




    // TODO: 9/9/21 walk through
//    @Override
//    public List<Ad> all() {
//        List<Ad> adsList = new ArrayList<>();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
//
//            while (rs.next()) {
//                //translate result set into java objects
//                adsList.add(new Ad(
//                        rs.getLong("id"),
//                        rs.getLong("user_id"),
//                        rs.getString("title"),
//                        rs.getString("description")
//                ));
//            }
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        return adsList;
//    }

//    @Override
//    public Long insert(Ad ad)  {//throws SQLException
//
//        String query = String.format("insert into ads (user_id, title, description values(%s, '%s', '%s')", ad.getUserId(),ad.getTitle(),ad.getDescription();
//
//        try{
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = stmt.getGeneratedKeys();
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        return null;
//    }



}

    

