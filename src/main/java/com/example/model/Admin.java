package com.example.model;

public class Admin extends Register {
    private String name;
    private String tnbr;

    private String lisence;
    private int id;
    public Admin() {
    }

    public String getLisence() {
        return lisence;
    }

    public void setLisence(String lisence) {
        this.lisence = lisence;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Admin(String uname, String pass, String jrole, String name, String tnbr, String lisence, int id) {
        super(uname, pass, jrole);
        this.name = name;
        this.tnbr = tnbr;
        this.lisence = lisence;
        this.id = id;
    }

    public Admin(String uname, String pass, String jrole, String name, String tnbr, String lisence) {
        super(uname, pass, jrole);
        this.name = name;
        this.tnbr = tnbr;
        this.lisence = lisence;
    }

    public Admin(String uname, String pass, String jrole, String name, String tnbr) {
        super(uname, pass, jrole);
        this.name = name;
        this.tnbr = tnbr;
    }

    public Admin(String uname, String pass, String jrole, String name) {
        super(uname, pass, jrole);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTnbr() {
        return tnbr;
    }

    public void setTnbr(String tnbr) {
        this.tnbr = tnbr;
    }
}
