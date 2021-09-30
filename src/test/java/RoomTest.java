import Guest.Guest;
import Room.Room;
import Room.TypeOf.Bedroom;
import RoomType.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;
    Guest guest;

    @Before
    public  void  before(){
        room = new Bedroom(4, 104, RoomType.FAMILY, 80);
        guest = new Guest("Colin");

    }

    @Test
    public  void hasCapacity(){
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        assertEquals(1, room.numberOfGuests());
    }
}
