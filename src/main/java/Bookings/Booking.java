package Bookings;

import Room.Room;
import Room.TypeOf.Bedroom;

import java.util.ArrayList;

public class Booking {
    private int nightsBooked;
    private Room room;
    private Bedroom bedroom;

    public Booking(int nightsBooked, Room room, Bedroom bedroom) {
        this.nightsBooked = nightsBooked;
        this.room = room;
        this.bedroom = bedroom;
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

    public int totalCostOfBooking(){
       return this.nightsBooked * bedroom.getRate();
    }
}
