package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class Pool {
    public String propertiesName = "connection-INF.properties";
    private static Pool instance = null;
    protected int maxCount = 100;
    protected int normalConnect = 10;
    protected String driverName = null;
    protected Driver driver = null;

    protected Pool() {
        try {
            init();
            loadDrivers(driverName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDrivers(String driverName) {
        try {
            driver = (Driver) Class.forName(driverName).newInstance();
            DriverManager.registerDriver(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() throws IOException {
        InputStream resourceAsStream = Pool.this.getClass().getResourceAsStream(propertiesName);
        Properties p = new Properties();
        p.load(resourceAsStream);
        this.driverName = p.getProperty("driverName");
        this.maxCount = Integer.parseInt(p.getProperty("maxCount"));
        this.normalConnect = Integer.parseInt(p.getProperty("normalConnect"));
    }

    public static synchronized Pool getInstance() throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
        if (instance == null) {
            instance.init();
            instance = (Pool) Class.forName("com.example.Pool").newInstance();
        }
        return instance;
    }

    protected synchronized void release(){
        try {
            DriverManager.deregisterDriver(driver);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public abstract void createPool();

    public abstract Connection getConnection();

    public abstract void freeConnection(Connection connection);

    public abstract int getNum();

    public abstract int getActiveNum();
}
