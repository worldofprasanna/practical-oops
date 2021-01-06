package com.routebee.domains;

public class Slot {
    private Vehicle vehicle;
    private int slotID;

    public Slot(int slotID) {
        this.slotID = slotID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isAvailable() {
        return this.vehicle == null;
    }

    public int getSlotID() {
        return slotID;
    }

    public int park(Car car) {
        this.setVehicle(car);
        return getSlotID();
    }

    public boolean containsCar(String regNo) {
        if (this.isAvailable()) {
            return false;
        }

        Vehicle vehicle = this.getVehicle();
        return vehicle.isRegisteredWithNo(regNo);
    }
}
