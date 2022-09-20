package com.example.dao;

import com.example.model.Admin;
import com.example.model.Booking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class viewAll {
    public static List<Admin> AdminAd() throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query="SELECT * FROM cabtest.datas where jrole='cu';";

        Statement ps= connection.createStatement();

        ResultSet rs =ps.executeQuery(query);
        List<Admin>AdminList = new ArrayList<Admin>();
        while (rs.next())
        {
          Admin admin = new Admin(rs.getString("uname"),rs.getString("pass"),rs.getString("jrole"),rs.getString("name"),rs.getString("pnbr") );
            AdminList.add(admin);
        }
        ps.close();
        connection.close();
        return AdminList;
    }
    public static List<Admin> AdminDriver() throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query="SELECT * FROM cabtest.datas where jrole='Dr';";

        Statement ps= connection.createStatement();

        ResultSet rs =ps.executeQuery(query);
        List<Admin>AdminList = new ArrayList<Admin>();
        while (rs.next())
        {
            Admin admin = new Admin(rs.getString("uname"),rs.getString("pass"),rs.getString("jrole"),rs.getString("name"),rs.getString("pnbr"), rs.getString("license") );
            AdminList.add(admin);
        }
        ps.close();
        connection.close();
        return AdminList;
    }
}
