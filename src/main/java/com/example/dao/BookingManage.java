package com.example.dao;

import com.example.model.Booking;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingManage {

    public static boolean RegisterBook(Booking booking) throws SQLException, ClassNotFoundException {
        GetConnection conncector = new Database();
        Connection connection = conncector.connection();

        String query="insert into cabtest.booking(cname,cnbr,toLocation,fromLocation,status)values(?,?,?,?,'pending')";
        PreparedStatement ps  = connection.prepareStatement(query);

        //insert variables
        ps.setString(1, booking.getCname());
        ps.setString(2, booking.getCpnber());
        ps.setString(3, booking.getTo());
        ps.setString(4, booking.getFrom());

        boolean result =ps.executeUpdate()>0;
        return result;
    }

    public static List<Booking> bookingsList(Booking books) throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query="SELECT * FROM cabtest.booking where cname=?";

        PreparedStatement ps= connection.prepareStatement(query);
        ps.setString(1,books.getCname());
        ResultSet rs =ps.executeQuery();
        List<Booking>bookingsArray = new ArrayList<Booking>();
        while (rs.next())
        {
            Booking book= new Booking(rs.getInt("id"),rs.getString("cname"), rs.getString("cnbr"),rs.getString("toLocation"),rs.getString("fromLocation"), rs.getString("status") );
            bookingsArray.add(book);
        }
        return bookingsArray;
    }

    public static boolean deleteBook(int id) throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();
        String query="delete from cabtest.booking where id=?";
        PreparedStatement ps  = connection.prepareStatement(query);

        //insert variables
       ps.setInt(1,id);
        boolean result =ps.executeUpdate()>0;
        return result;
    }

    public static List<Booking> bookingsListDriver(Booking books) throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query="SELECT * FROM cabtest.booking where cname=?";

        PreparedStatement ps= connection.prepareStatement(query);
        ps.setString(1,books.getCname());
        ResultSet rs =ps.executeQuery();
        List<Booking>bookingsArray = new ArrayList<Booking>();
        while (rs.next())
        {
            Booking book= new Booking(rs.getInt("id"),rs.getString("cname"), rs.getString("cnbr"),rs.getString("toLocation"),rs.getString("fromLocation"), rs.getString("status") );
            bookingsArray.add(book);
        }
        return bookingsArray;
    }

    public static List<Booking> bookingsListDriver() throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query="SELECT * FROM cabtest.booking;";

        Statement ps= connection.createStatement();

        ResultSet rs =ps.executeQuery(query);
        List<Booking>bookingsArray = new ArrayList<Booking>();
        while (rs.next())
        {
            Booking book= new Booking(rs.getInt("id"),rs.getString("cname"), rs.getString("cnbr"),rs.getString("toLocation"),rs.getString("fromLocation"), rs.getString("status"),rs.getDouble("amount"), rs.getString("dname"), rs.getString("dnbr"));
            bookingsArray.add(book);
        }
        ps.close();
        connection.close();
        return bookingsArray;
    }


    public static Booking getview(int id) throws SQLException, ClassNotFoundException {
        GetConnection connector = new Database();
        Connection connection = connector.connection();

        String query="SELECT * FROM cabtest.booking where id=?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        Booking booking = new Booking();
        if(rs.next())
        {   booking.setId(rs.getInt("id"));
            booking.setCname(rs.getString("cname"));
            booking.setCpnber(rs.getString("cnbr"));
            booking.setTo(rs.getString("toLocation"));
            booking.setFrom(rs.getString("fromLocation"));

        }
            return booking;
    }
}
