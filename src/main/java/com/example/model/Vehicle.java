package com.example.model;

public class Vehicle {
    private int id;
    private String vetype;
    private String vnbr;
    private String Dname;
    private String license;
    private String registerbranch;

    public Vehicle() {
    }

    public Vehicle(String vetype, String vnbr, String dname, String license, String registerbranch) {
        this.vetype = vetype;
        this.vnbr = vnbr;
        Dname = dname;
        this.license = license;
        this.registerbranch = registerbranch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVetype() {
        return vetype;
    }

    public void setVetype(String vetype) {
        this.vetype = vetype;
    }

    public String getVnbr() {
        return vnbr;
    }

    public void setVnbr(String vnbr) {
        this.vnbr = vnbr;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getRegisterbranch() {
        return registerbranch;
    }

    public void setRegisterbranch(String registerbranch) {
        this.registerbranch = registerbranch;
    }
}
