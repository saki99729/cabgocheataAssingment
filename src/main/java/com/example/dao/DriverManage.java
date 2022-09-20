package com.example.dao;

import com.example.model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DriverManage {

    public static boolean RegisterDriver(Admin admin) throws SQLException, ClassNotFoundException {
        GetConnection conncector = new Database();
        Connection connection = conncector.connection();

        String query="insert into cabtest.datas(uname,pass,jrole,name,pnbr,license)values(?,?,'Dr',?,?,?)";
        PreparedStatement ps  = connection.prepareStatement(query);

        //insert variables
        ps.setString(1, admin.getUname());
        ps.setString(2, admin.getPass());
        ps.setString(3, admin.getName());
        ps.setString(4, admin.getTnbr());
        ps.setString(5,admin.getLisence());

        boolean result =ps.executeUpdate()>0;
        return result;
    }
}
