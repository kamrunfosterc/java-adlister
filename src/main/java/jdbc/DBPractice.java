package jdbc;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;


public class DBPractice {

    public static void main(String[] args) throws SQLException {
        //todo numb 1.
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
        //todo numb 2. fetch some users from my users table
        Statement statement = connection.createStatement();

//        //execute: returns a boolean indicating success
//        statement.execute("DELETE FROM albums WHERE id = 4");
//
//        //executeUpdate: returns the number of rows affected
//        statement.executeUpdate("INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Nelly Furtado', 'Loose', 2006, 'Dance-pop, hip hop, R&B', 12.5)");

        //executeQuery: returns a ResultSet object
        ReslutSet rows = statement.executeQuery("SELECT u.name, u.email FROM users as u");// missing data base currently, ignore
        // iterate over the rows
        while (rows.next()) {
            // rows points to the current row
            // output name and email of current row
            String currentUserName = rows.getString("name");
            String currentUserEmail = rows.getString("email");
            Long currentUserId = rows.getInt("id");
            System.out.println(rows.getString(currentUserId+" "+currentUserName+" "+currentUserEmail));
        }
        // insert a new user: tom jones
        int numRows = statement.executeUpdate("insert into users (name, email, role_id) values ('Tom Jones', 'tom@tom.com', 4)");
       if (numRows < 1){
           System.out.println("something bad happened! Tom not inserted");
       }
        System.out.println(numRows + "row(s) inserted");

        ResultSet newKeys = statement.getGeneratedKeys();
        int tomsId = 0;
        if (newKeys.next()){
            tomsId = newKeys.getInt(1);
        }
        System.out.println(tomsId + "is the id for the new Tom Jones record");

        //clean up your stuff
        rows.close();
        statement.close();
        connection.close();


    }

}
