package com.codeup.adlister.dao;

import com.codeup.adlister.Config;

import java.sql.Connection;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();
    private Connection usersData;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }




}
