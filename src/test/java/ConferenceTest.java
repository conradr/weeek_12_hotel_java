import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Glitter", 200);
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("Glitter", conferenceRoom.getName());

    }
    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(200, conferenceRoom.getCapacity());

    }

}
