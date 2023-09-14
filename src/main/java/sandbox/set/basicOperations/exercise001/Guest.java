package main.java.sandbox.set.basicOperations.exercise001;

import java.util.Objects;

public class Guest {
    private String name;
    private int invitationCode;

    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(int invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", invitationCode=" + invitationCode +
                '}';
    }
}
