package com.example.model;

public class Register {
    private int id;
    private String uname;
    private String pass;

    private String jrole;

    public Register() {
    }

    public Register(String uname, String pass) {
    }

    public Register(String uname, String pass ,String jrole) {
        this.uname = uname;
        this.pass = pass;
        this.jrole=jrole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getJrole() {
        return jrole;
    }

    public void setJrole(String jrole) {
        this.jrole = jrole;
    }
}
