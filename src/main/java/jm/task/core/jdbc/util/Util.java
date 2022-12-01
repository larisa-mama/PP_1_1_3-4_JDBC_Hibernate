package jm.task.core.jdbc.util;

import java.sql.*;

public class Util<connection> {
    // реализуйте настройку соеденения с БД
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";

    public static Connection connection;

    public static Connection getConnection() throws SQLException {

        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
            connection.setAutoCommit(false);
           // System.out.println("Есть соединение");
        } catch (ClassNotFoundException|SQLException e) {
           e.printStackTrace();
           System.out.println("Нет соединения");
        }
        return connection;
    }
}
