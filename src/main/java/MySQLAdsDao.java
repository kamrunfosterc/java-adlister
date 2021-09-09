import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{


    private Connection connection;//private instance property

    public MySQLAdsDao() throws SQLException {
        DriverManager.registerDriver(new Driver());
        Config config = new Config();
         connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }

    // using connection make queries that grabs ads result
    // TODO: 9/9/21  
    @Override
    public List<Ad> all() throws SQLException{
        List<Ad> adsList = new ArrayList<>();
        Statement statement = connection.createStatement();
        String selectQuery = "SELECT * FROM ads";
        ResultSet rs = statement.executeQuery(selectQuery);

        while (rs.next()) {

            adsList.add(new Ad(
                    rs.getLong("id"),
                    rs.getLong("user_id"),
                    rs.getString("title"),
                    rs.getString("name")
            ));
        }
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads (user_id, title, description) " +
                "VALUES(" + ad.getUserId()+ ", " + ad.getTitle()+ ", " + ad.getDescription()+")";

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            return rs.getLong(1);
        }
        return null;// returns if something went wrong when we inserted
    }

    
}
