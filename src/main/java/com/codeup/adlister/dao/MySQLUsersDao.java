package com.codeup.adlister.dao;

import com.codeup.adlister.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection;//private instance property

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        String query = "select * from users where username = ? limit 1";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()){
                return new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        try {
////            PreparedStatement pStmt = connection.prepareStatement(sql);
////            pStmt.setSTring(1, username);
////
////            ResultSet rs = pStmt.executQuery();
////
////            System.out.println(rs);
////            return new User(
////                    rs.getLong("id"),
////                    rs.getString("username"),
////                    rs.getString("email"),
////                    rs.getString("password")
//            );
//        } catch(SQLException e){
//            e.printStackTrace();
//        }
        return null;
    }

    @Override
    public Long insert(User user) {
//        try {
//            Statement stmt = connection.createStatement();
//            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = stmt.getGeneratedKeys();
//            if (rs.next()) {
//                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
//                return rs.getLong(1);
//            }
//        }catch (SQLException e){
//            System.out.println(e);
//        }
        String query = "INSERT INTO users (username, email, password) " +
                "VALUES(?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement);


            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.execute();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();

            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }
}
