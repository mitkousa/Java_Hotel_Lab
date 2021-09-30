package Room;
import Guest.Guest;
import Room.TypeOf.Bedroom;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guest = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuest() {
        return guest;
    }

    public void setGuest(ArrayList<Guest> guest) {
        this.guest = guest;
    }

    public int guestCount(){
        return guest.size();
    }

    public void addGuest(Guest guest){
        this.guest.add(guest);
    }

    public int numberOfGuests(){
        return this.guest.size();
    }
}
