package com.example.Service;

import com.example.dao.BookingManage;
import com.example.model.Booking;

import java.sql.SQLException;
import java.util.List;

public class BookingService {
    public static boolean RegisterBook(Booking booking) throws SQLException, ClassNotFoundException {
        return BookingManage.RegisterBook(booking);
    }
    public static List<Booking> bookingsList(Booking books) throws SQLException, ClassNotFoundException {
        return BookingManage.bookingsList(books);
    }

    public static boolean deleteBook(int id) throws SQLException, ClassNotFoundException {
        return BookingManage.deleteBook(id);
    }
    public static List<Booking> bookingsListDriver() throws SQLException, ClassNotFoundException {
       return BookingManage.bookingsListDriver();
    }
    public static Booking getview(int id) throws SQLException, ClassNotFoundException {
        return BookingManage.getview(id);
    }
}
