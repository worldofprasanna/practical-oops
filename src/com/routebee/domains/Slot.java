package com.routebee.domains;

public class Slot {
    private Car car;
    private int slotID;

    public Slot(int slotID) {
        this.slotID = slotID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean isAvailable() {
        return this.car == null;
    }
}
