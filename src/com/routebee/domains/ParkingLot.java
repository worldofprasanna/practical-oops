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

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
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
}
