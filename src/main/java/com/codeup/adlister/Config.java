package com.codeup.adlister;

public class Config {

    // holds our database configuration
    // should have 3 public methods, getUrl, getUsername, getPassword
    public String getUrl(){
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    public String getUser(){
        return "root";// original thought to use user
    }
    public String getPassword(){
        return "codeup";// origingal thought to use password
    }



}
