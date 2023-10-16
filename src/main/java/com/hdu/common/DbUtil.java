package com.hdu.common;

import java.sql.*;

public class DbUtil {
    public static Connection getConnection(String username, String password, String dbName) {
        DbOptions dbOptions = new DbOptions(username, password, dbName);
        try {
            Class.forName(dbOptions.getDriver());
            return DriverManager.getConnection(
                    dbOptions.getUrl(),
                    dbOptions.getUsername(),
                    dbOptions.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getConnection(String username, String password, String ip, String port, String dbName,
            String driver) {
        DbOptions dbOptions = new DbOptions(username, password, ip, port, dbName, driver);
        try {
            Class.forName(dbOptions.getDriver());
            return DriverManager.getConnection(
                    dbOptions.getUrl(),
                    dbOptions.getUsername(),
                    dbOptions.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void closeConnection(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
