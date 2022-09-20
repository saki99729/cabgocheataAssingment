package com.example.Service;

import com.example.dao.viewAll;
import com.example.model.Admin;

import java.sql.SQLException;
import java.util.List;

public class viewAllservice {
    public static List<Admin> AdminAd() throws SQLException, ClassNotFoundException {
        return viewAll.AdminAd();
    }

    public static List<Admin> AdminDriver() throws SQLException, ClassNotFoundException {
        return viewAll.AdminDriver();
    }
}
