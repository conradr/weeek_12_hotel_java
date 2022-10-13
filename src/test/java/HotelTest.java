import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom sparkly;
    Guest jackie;
    Guest peter;


    @Before
    public void before() {
        hotel = new Hotel();
        sparkly = new Bedroom(RoomType.SINGLE,7);
        jackie = new Guest("Jackie");
        peter = new Guest("Peter");
    }

    @Test
    public void hotelHasNoBedrooms(){
        assertEquals(0, hotel.getBedrooms().size());
    }
    @Test
    public void hotelHasNoConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddBedroomToHotel(){
        hotel.addBedroomToHotel(sparkly);
        assertEquals(1, hotel.getBedrooms().size());
    }
    @Test
    public void canAddGuestToBedroom(){
        hotel.addBedroomToHotel(sparkly);
        hotel.addGuestToRoom(jackie, sparkly);
        assertEquals("Jackie", sparkly.getGuestsInRoom().get(0).getGuestName());
    }
    @Test
    public void canRemoveGuestToBedroom(){
        hotel.addBedroomToHotel(sparkly);
        hotel.addGuestToRoom(jackie, sparkly);
        hotel.addGuestToRoom(peter, sparkly);
        hotel.removeGuestFromRoom(jackie, sparkly);
        assertEquals(1, sparkly.getGuestsInRoom().size());
        assertEquals("Peter", sparkly.getGuestsInRoom().get(0).getGuestName());
    }
}
