package com.example.Service;

import com.example.dao.AdminManage;
import com.example.model.Admin;

import java.sql.SQLException;

public class AdminService {
    public static Admin loginAdmin(String username, String password) throws SQLException, ClassNotFoundException {
        return AdminManage.loginAdmin(username, password);
    }
}
