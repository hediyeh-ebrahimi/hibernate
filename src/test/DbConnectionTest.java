package test;


import model.Book;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import service.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbConnectionTest {

    private static DbConnection dbConnection;

    @BeforeClass
    public static void beforeClass() {
        dbConnection = new DbConnection();
    }

    @AfterClass
    public static void afterClass() {
        dbConnection.closeConnection();
    }

    //   @Test
    public void getConnection() {
        dbConnection.getConnection();
    }

    @Test
    public void select() throws SQLException {
        List<Book> bookList = new ArrayList<>();
        //try with resource for auto closing
        try (ResultSet resultSet = dbConnection.getConnection().createStatement()
                .executeQuery("select id,AUTHOR,name ,PRICE,CREATE_TIME from book ")) {
            while (resultSet.next()) {
                bookList.add(
                        new Book()
                                .setId(resultSet.getLong(1))
                                .setName(resultSet.getString(3))
                                .setAuthor(resultSet.getString(2))
                                .setPrice(resultSet.getLong(4))
                                .setCreatedAt(resultSet.getDate(5))
                );
//                System.out.println(resultSet.getString(1));
//                System.out.println(resultSet.getObject("author"));
//                System.out.println(resultSet.getString(3));
//                System.out.println(resultSet.getObject("price"));

            }
        }

        bookList.stream().forEach(System.out::println);

    }

    @Test
    public void update(){
        try (Statement statement = dbConnection.getConnection().createStatement()){
            int resultSet = statement.executeUpdate("update book set name = 784 where id = 1");
//            dbConnection.getConnection().setAutoCommit(false);
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}