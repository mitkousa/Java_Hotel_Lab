import Room.TypeOf.Bedroom;
import org.junit.Before;
import RoomType.RoomType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(4,102, RoomType.DOUBLE);
    }

    @Test
    public  void hasCapacity(){
        assertEquals(4, bedroom.getCapacity());
    }
}
