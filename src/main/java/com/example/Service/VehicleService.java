package com.example.Service;

import com.example.dao.VehicleManage;
import com.example.model.Vehicle;

import java.sql.SQLException;

public class VehicleService {
    public static boolean regVehicle(Vehicle vehicle) throws SQLException, ClassNotFoundException {
        return VehicleManage.RegisterVehicke(vehicle);
    }
}
