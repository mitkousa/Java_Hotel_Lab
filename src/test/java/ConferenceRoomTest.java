import Room.TypeOf.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(50, "Creative Arena");
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Creative Arena", conferenceRoom.getName());
    }

    @Test
    public void hasNoGuest(){
        assertEquals(0, conferenceRoom.guestCount());
    }
}
