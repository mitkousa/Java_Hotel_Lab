import Guest.Guest;
import Room.TypeOf.Bedroom;
import Room.TypeOf.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRoom;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRoom = new ArrayList<>();
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
}
