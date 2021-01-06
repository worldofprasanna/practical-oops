package com.routebee;

import com.routebee.domains.ParkingLot;

public class PracticalOops {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(6);
        System.out.println("Total Slots: " + parkingLot.totalSlots());
        System.out.println("Available Slots: " + parkingLot.totalAvailableSlots());
    }
}
