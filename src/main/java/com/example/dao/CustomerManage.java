package com.example.dao;


import com.example.model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerManage {

    public static boolean RegisterCustomer(Admin admin) throws SQLException, ClassNotFoundException {
        GetConnection conncector = new Database();
        Connection connection = conncector.connection();

        String query="insert into cabtest.datas(uname,pass,jrole,name,pnbr)values(?,?,'cu',?,?)";
        PreparedStatement ps  = connection.prepareStatement(query);

        //insert variables
        ps.setString(1, admin.getUname());
        ps.setString(2, admin.getPass());
        ps.setString(3, admin.getName());
        ps.setString(4, admin.getTnbr());

        boolean result =ps.executeUpdate()>0;
        return result;
    }
}
