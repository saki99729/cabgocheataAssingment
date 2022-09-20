package com.example.Service;

import com.example.dao.DriverManage;
import com.example.model.Admin;

import java.sql.SQLException;

public class DriverService {
    public static boolean RegisterDriver(Admin admin) throws SQLException, ClassNotFoundException {
        return DriverManage.RegisterDriver(admin);
    }
}
