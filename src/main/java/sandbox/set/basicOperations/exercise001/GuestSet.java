package main.java.sandbox.set.basicOperations.exercise001;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode) {
        guestSet.add(new Guest(name, invitationCode));
    }

    public void removeGuest(int invitationCode) {
        if (!guestSet.isEmpty()) {
            guestSet.removeIf(guest -> guest.getInvitationCode() == invitationCode);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }
}
