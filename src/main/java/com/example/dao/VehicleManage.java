package com.example.dao;

import com.example.model.Vehicle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleManage {


    public static boolean RegisterVehicke(Vehicle vehicle) throws SQLException, ClassNotFoundException {
        GetConnection conncector = new Database();
        Connection connection = conncector.connection();

        String query="insert into cabtest.vehicle(vtype,vnbr,Dname,license,branch)values(?,?,?,?,?)";
        PreparedStatement ps  = connection.prepareStatement(query);

        //insert variables
        ps.setString(1, vehicle.getVetype());
        ps.setString(2, vehicle.getVnbr());
        ps.setString(3, vehicle.getDname());
        ps.setString(4, vehicle.getLicense());
        ps.setString(5, vehicle.getRegisterbranch());

        boolean result =ps.executeUpdate()>0;
        return result;
    }
}
