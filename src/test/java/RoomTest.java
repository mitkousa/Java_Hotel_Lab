import Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

//    @Before
//    public  void  before(){
//        room = new Room(4);
//    }

    @Test
    public  void hasCapacity(){
        assertEquals(4, room.getCapacity());
    }
}
