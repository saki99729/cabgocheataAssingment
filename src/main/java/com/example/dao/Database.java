package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database implements GetConnection {
    @Override
    public Connection connection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //establish connection
        String url="jdbc:mysql://127.0.0.1:3306/cabtest";
        String username="root";
        String password="0000";


        return DriverManager.getConnection(url,username,password);

    }
}
