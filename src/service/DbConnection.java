package service;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
    private Connection connection;
    private Properties properties;

    public DbConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Load Driver Class",e);
        }
        properties = new Properties();
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResource("setting/properties.txt").openStream();
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        if(connection != null ) return connection;
        try {
//            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hibernate","123");
            return DriverManager.getConnection(properties.getProperty("db.url"),properties.getProperty("db.username")
                    ,properties.getProperty("db.password"));
        } catch (SQLException e) {
            throw new IllegalStateException("Check Database Connection Info",e);
        }
    }

    public void closeConnection(){
        if(connection!= null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
