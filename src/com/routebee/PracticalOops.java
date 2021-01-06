package com.routebee;

import com.routebee.domains.Car;
import com.routebee.domains.ParkingLot;

public class PracticalOops {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(6);
        System.out.println("Total Slots: " + parkingLot.totalSlots());
        System.out.println("Available Slots: " + parkingLot.totalAvailableSlots());

        Car car = new Car("A1", "i20");
        int slotNo = parkingLot.parkInSlot(car);
        car = new Car("B1", "jazz");
        slotNo = parkingLot.parkInSlot(car);
        car = new Car("C1", "swift");
        slotNo = parkingLot.parkInSlot(car);

        System.out.println("Car B1 is parked in slot: " + parkingLot.findSlotByCar("B1"));

    }
}
