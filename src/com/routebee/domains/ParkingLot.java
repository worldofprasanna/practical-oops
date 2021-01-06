package com.routebee.domains;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Slot> slots;

    public ParkingLot(int count) {
        int i = 0;
        slots = new ArrayList<>();
        while (i < count) {
            Slot slot = new Slot(i);
            slots.add(slot);
            i++;
        }
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public int totalSlots() {
        return getSlots().size();
    }

    public int totalAvailableSlots() {
        List<Slot> allSlots = getSlots();
        int totalAvailable = 0;
        for (Slot slot: allSlots) {
            if (slot.isAvailable()) {
                totalAvailable ++;
            }
        }
        return totalAvailable;
    }

    private int nextAvailableSlot() {
        List<Slot> allSlots = getSlots();
        for (Slot slot: allSlots) {
            if (slot.isAvailable()) {
                return slot.getSlotID();
            }
        }
        return -1;
    }

    public int parkInSlot(Vehicle vehicle) {
        List<Slot> allSlots = getSlots();
        int slotNo = nextAvailableSlot();
        Slot slot = allSlots.get(slotNo);
        slot.park(vehicle);
        return slot.getSlotID();
    }

    public int findSlotByCar(String regNo) {
        List<Slot> allSlots = getSlots();
        for (Slot slot: allSlots) {
            if (slot.containsCar(regNo))
                return slot.getSlotID();
        }
        return -1;
    }
}
