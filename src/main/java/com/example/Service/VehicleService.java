package com.example.Service;

import com.example.dao.VehicleManage;
import com.example.model.Vehicle;

import java.sql.SQLException;
import java.util.List;

public class VehicleService {
    public static boolean regVehicle(Vehicle vehicle) throws SQLException, ClassNotFoundException {
        return VehicleManage.RegisterVehicke(vehicle);
    }
    public static List<Vehicle> vehicleAll() throws SQLException, ClassNotFoundException {
        return VehicleManage.vehicleAll();
    }

    public static List<Vehicle> vehicleAllDrive(Vehicle  vehicle) throws SQLException, ClassNotFoundException {
        return VehicleManage.vehicleAllDrivers(vehicle);
    }
}
