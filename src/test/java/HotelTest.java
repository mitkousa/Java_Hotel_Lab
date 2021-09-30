import Bookings.Booking;
import Guest.Guest;
import Room.TypeOf.Bedroom;
import RoomType.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom;
    Guest guest;
    Booking booking;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        bedroom = new Bedroom(3,108, RoomType.TRIPLE, 80);
        guest = new Guest("Batman");
        booking = new Booking(7, bedroom);
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasCollectionOfBedrooms(){
        assertEquals(0, hotel.numberOfBedrooms());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.numberOfBedrooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.addBedroom(bedroom);
        hotel.checkInGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCreateBooking(){
       Booking booking = hotel.createBooking(bedroom, 7);
       hotel.addBooking(booking);
        assertEquals(1,hotel.numberOfBookings());
    }
}
