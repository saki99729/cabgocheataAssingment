package com.example.dao;

import com.example.model.Booking;
import com.example.model.Vehicle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleManage {


    public static boolean RegisterVehicke(Vehicle vehicle) throws SQLException, ClassNotFoundException {
        GetConnection conncector = new Database();
        Connection connection = conncector.connection();

        String query = "insert into cabtest.vehicle(vtype,vnbr,Dname,license,branch)values(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(query);

        //insert variables
        ps.setString(1, vehicle.getVetype());
        ps.setString(2, vehicle.getVnbr());
        ps.setString(3, vehicle.getDname());
        ps.setString(4, vehicle.getLicense());
        ps.setString(5, vehicle.getRegisterbranch());

        boolean result = ps.executeUpdate() > 0;
        return result;
    }

    public static List<Vehicle> vehicleAllDrivers(Vehicle vehicle) throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query = "SELECT * FROM cabtest.vehicle  where Dname=?";

        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, vehicle.getDname());
        ResultSet rs = ps.executeQuery();
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        while (rs.next()) {
            Vehicle vehicle1 = new Vehicle(rs.getString("vtype"), rs.getString("vnbr"), rs.getString("Dname"), rs.getString("license"), rs.getString("branch"));
            vehicleList.add(vehicle);
        }
        return vehicleList;
    }
    public static List<Vehicle> vehicleAll() throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query = "SELECT * FROM cabtest.vehicle";

        Statement ps = connection.createStatement();

        ResultSet rs = ps.executeQuery(query);
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        while (rs.next()) {
            Vehicle vehicle = new Vehicle(rs.getString("vtype"), rs.getString("vnbr"), rs.getString("Dname"), rs.getString("license"), rs.getString("branch"));
            vehicleList.add(vehicle);
        }
        return vehicleList;
    }

}
