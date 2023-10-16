package com.hdu.common;

public class DbOptions {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private final String url;
    private final String ip = "localhost";
    private final String port = "3306";
    private String username;
    private String password;


    public DbOptions(String username, String password, String dbName) {
        this.username = username;
        this.password = password;
        this.url = "jdbc:mysql://" + ip + ":" + port + "/" + dbName;
    }

    public DbOptions(String username, String password, String ip, String port, String dbName, String driver) {
        this.username = username;
        this.password = password;
        this.url = "jdbc:mysql://" + ip + ":" + port + "/" + dbName;
        this.driver = driver;
    }

    public String getIp() {
        return ip;
    }

    public String getPort() {
        return port;
    }

    public String getUrl() {
        return url;
    }

    public String getDriver() {
        return driver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
