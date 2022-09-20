package com.example.Service;

import com.example.dao.CustomerManage;
import com.example.model.Admin;

import java.sql.SQLException;

public class customerService {
    public static boolean RegisterCustomer(Admin admin) throws SQLException, ClassNotFoundException {
        return CustomerManage.RegisterCustomer(admin);
    }
}
