import Guest.Guest;
import Room.Room;
import Room.TypeOf.Bedroom;
import Room.TypeOf.ConferenceRoom;
import Bookings.Booking;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRoom;
    private Booking booking;
    private ArrayList<Booking> newBooking;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRoom = new ArrayList<>();
        this.newBooking = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(ArrayList<ConferenceRoom> conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int numberOfBedrooms(){
        return this.bedrooms.size();
    }

    public Bedroom getBedroom(){
        return this.bedrooms.get(0);
    }

    public void checkInGuest(Guest guest) {
        Bedroom bedroom = getBedroom();
        bedroom.addGuest(guest);
    }

    public Booking createBooking(Room room, int numberOfNights) {
        booking = new Booking(numberOfNights, room);
        return booking;
    }

    public void addBooking(Booking newBooking){
        this.newBooking.add(booking);
    }

    public int numberOfBookings(){
        return this.newBooking.size();
    }
}
