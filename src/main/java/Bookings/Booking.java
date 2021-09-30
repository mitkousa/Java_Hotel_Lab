package Bookings;

import Room.Room;
import Room.TypeOf.Bedroom;

import java.util.ArrayList;

public class Booking {
    private int nightsBooked;
    private Room room;

    public Booking(int nightsBooked, Room room) {
        this.nightsBooked = nightsBooked;
        this.room = room;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public void setNightsBooked(int nightsBooked) {
        this.nightsBooked = nightsBooked;
    }

    public Room getBedroom() {
        return room;
    }

    public void setBedroom(Bedroom bedroom) {
        this.room = bedroom;
    }
}
