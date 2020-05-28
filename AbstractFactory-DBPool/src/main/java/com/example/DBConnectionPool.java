package com.example;

import java.sql.Connection;
import java.util.Vector;

public class DBConnectionPool extends Pool{
    private int checkOut;
    private Vector<Connection> freeConnections = new Vector<Connection>();
    private String password;
    private String url;
    private String username;
    private static int num = 0;
    private static int activeNum = 0;
    private static DBConnectionPool pool;


    public void createPool() {

    }

    public Connection getConnection() {
        return null;
    }

    public void freeConnection(Connection connection) {

    }

    public int getNum() {
        return 0;
    }

    public int getActiveNum() {
        return 0;
    }
}
