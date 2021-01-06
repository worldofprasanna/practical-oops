package com.routebee.domains;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Slot> carSlots;
    private List<Slot> bikeSlots;

    public ParkingLot(int carCount, int bikeCount) {
        int i = 0;
        carSlots = new ArrayList<>();
        while (i < carCount) {
            Slot slot = new CarSlot(i);
            carSlots.add(slot);
            i++;
        }
        i = 0;
        bikeSlots = new ArrayList<>();
        while (i < bikeCount) {

            Slot slot = new CarSlot(i);
            bikeSlots.add(slot);
            i++;
        }
    }

    public List<Slot> getCarSlots() {
        return carSlots;
    }

    public List<Slot> getBikeSlots() {
        return carSlots;
    }

    public int totalSlots() {
        return getCarSlots().size() + getBikeSlots().size();
    }

    public int totalAvailableSlots() {
        List<Slot> allSlots = getCarSlots();
        int totalAvailable = 0;
        for (Slot slot: allSlots) {
            if (slot.isAvailable()) {
                totalAvailable ++;
            }
        }
        allSlots = getBikeSlots();
        for (Slot slot: allSlots) {
            if (slot.isAvailable()) {
                totalAvailable ++;
            }
        }
        return totalAvailable;
    }

    private Slot nextAvailableSlot(List<Slot> allSlots) {
        for (Slot slot: allSlots) {
            if (slot.isAvailable()) {
                return slot;
            }
        }
        return null;
    }

    private Slot nextAvailableCarSlot() {
        return nextAvailableSlot(this.getCarSlots());
    }

    private Slot nextAvailableBikeSlot() {
        return nextAvailableSlot(this.getBikeSlots());
    }

    public int parkInSlot(Vehicle vehicle) {
        Slot slot = null;
        if (vehicle instanceof Car) {
            slot = nextAvailableCarSlot();
        } else {
            slot = nextAvailableBikeSlot();
        }
        slot.park(vehicle);
        return slot.getSlotID();
    }

    public int findSlotByCar(String regNo) {
        List<Slot> allSlots = getCarSlots();
        for (Slot slot: allSlots) {
            if (slot.containsCar(regNo))
                return slot.getSlotID();
        }
        return -1;
    }
}
