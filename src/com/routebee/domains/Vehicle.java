package com.routebee.domains;

public class Vehicle {
    private String regNo;
    private String model;

    public Vehicle(String regNo, String model) {
        this.regNo = regNo;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public boolean isRegisteredWithNo(String regNo) {
        return this.getRegNo() == regNo;
    }
}
