package Room.TypeOf;

import Room.Room;
import RoomType.RoomType;

public class Bedroom extends Room {
    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int capacity, int roomNumber, RoomType roomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }
}
