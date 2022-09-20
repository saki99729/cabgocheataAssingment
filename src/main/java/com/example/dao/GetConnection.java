package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface GetConnection {
    public Connection connection() throws SQLException, ClassNotFoundException;
}
