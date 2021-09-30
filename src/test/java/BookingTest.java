import Bookings.Booking;
import Room.TypeOf.Bedroom;
import RoomType.RoomType;
import org.junit.Before;

public class BookingTest {
    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(3,108, RoomType.TRIPLE, 80);
        booking = new Booking(7, bedroom);
    }
}
