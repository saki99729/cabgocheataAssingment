package com.example.model;


import com.example.Service.AdminService;
import com.example.Service.BookingService;
import com.example.Service.viewAllservice;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest extends Register {



    @Test
    void test() throws SQLException, ClassNotFoundException {
        viewAllservice service = new viewAllservice();
        Admin register = new Admin("sakila","pass");
        List<Admin>actual = new ArrayList<>();
        List<Admin>extpected= new ArrayList<>();
        actual.add(register);
        actual=service.AdminAd();
        extpected= Arrays.asList(new Admin("sakila","pass"));
    }

    @Test
    void testbooking() throws SQLException, ClassNotFoundException {
        BookingService service = new BookingService();
        Booking  booking = new Booking("sakila","0715621152","Anuradhapura","Colombo","pending",20000,"kriss","0714978207");
        List<Booking>actual = new ArrayList<>();
        List<Booking> expected = new ArrayList<>();
        actual=service.bookingsList(booking);
        expected=Arrays.asList(new Booking("sakila","0715621152","Anuradhapura","Colombo","pending",20000,"kriss","0714978207"));


    }

}