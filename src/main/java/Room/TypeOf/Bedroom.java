package Room.TypeOf;

import Room.Room;
import RoomType.RoomType;

public class Bedroom extends Room {
    private int roomNumber;
    private RoomType roomType;
    private int rate;

    public Bedroom(int capacity, int roomNumber, RoomType roomType, int rate) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
