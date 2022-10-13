import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Guest guest;
    Bedroom bedroom;

    RoomType roomType;
    private ArrayList<Guest> guestsInRoom;

    @Before
    public void before() {
        guest = new Guest("Jackie");
        bedroom = new Bedroom(RoomType.SINGLE,212);
    }

    @Test
    public void bedroomHasRoomType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
    @Test
    public void bedroomHasRoomNumber() {
        assertEquals(212, bedroom.getRoomNumber());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom.getNumberOfGuestsInRoom());
    }

    @Test
    public void getRoomCapacityFromEnum() {
        assertEquals(1, bedroom.getCapacity());
    }


}
