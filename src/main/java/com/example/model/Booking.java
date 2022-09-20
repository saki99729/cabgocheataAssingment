package com.example.model;

public class Booking {
    private int id;
    private String cname;
    private String cpnber;
    private String To;
    private String From;
    private String status;
    private double  amount;
    private String dname;
    private String dnbr;


    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Booking(int id, String cname, String cpnber, String to, String from, String status) {
        this.id = id;
        this.cname = cname;
        this.cpnber = cpnber;
        To = to;
        From = from;
        this.status = status;
    }

    public Booking(String cname, String cpnber, String to, String from, String status, double amount, String dname, String dnbr) {
        this.cname = cname;
        this.cpnber = cpnber;
        To = to;
        From = from;
        this.status = status;
        this.amount = amount;
        this.dname = dname;
        this.dnbr = dnbr;
    }

    public Booking(String cname, String cpnber, String to, String from, String status) {
        this.cname = cname;
        this.cpnber = cpnber;
        To = to;
        From = from;
        this.status = status;
    }

    public Booking(String cname, String status, double amount, String dname, String dnbr) {
        this.cname = cname;
        this.status = status;
        this.amount = amount;
        this.dname = dname;
        this.dnbr = dnbr;
    }

    public Booking(int id, String cname, String cpnber, String to, String from, String status, double amount, String dname, String dnbr) {
        this.id = id;
        this.cname = cname;
        this.cpnber = cpnber;
        To = to;
        From = from;
        this.status = status;
        this.amount = amount;
        this.dname = dname;
        this.dnbr = dnbr;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpnber() {
        return cpnber;
    }

    public void setCpnber(String cpnber) {
        this.cpnber = cpnber;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDnbr() {
        return dnbr;
    }

    public void setDnbr(String dnbr) {
        this.dnbr = dnbr;
    }
}
