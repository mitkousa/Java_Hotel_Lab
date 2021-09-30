import Room.TypeOf.Bedroom;
import Room.TypeOf.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedroom;
    private ArrayList<ConferenceRoom> conferenceRoom;

    public Hotel(String name) {
        this.name = name;
        this.bedroom = new ArrayList<>();
        this.conferenceRoom = new ArrayList<>();
    }
}
