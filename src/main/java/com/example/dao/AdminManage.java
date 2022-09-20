package com.example.dao;

import com.example.model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminManage {
    public static Admin loginAdmin(String username, String password) throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();
        String query = "SELECT * FROM cabtest.datas where uname=? and pass=?";
        PreparedStatement ps = connection.prepareStatement(query);
        Admin admin = new Admin();
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            admin.setName(rs.getString("name"));
            admin.setJrole(rs.getString("jrole"));
            admin.setUname(rs.getString("uname"));
            admin.setPass(rs.getString("pass"));
            admin.setTnbr(rs.getString("pnbr"));
        }
        ps.close();
        connection.close();
        return admin;
    }
}
