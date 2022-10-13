import java.util.ArrayList;
import java.util.Collection;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addGuestToRoom(Guest guest, Bedroom room) {
        room.addGuestToRoom(guest);
    }
    public void removeGuestFromRoom(Guest guest, Bedroom room) {
        room.removeGuestFromRoom(guest);
    }
    public void addBedroomToHotel(Bedroom room) {
        bedrooms.add(room);
    }


}
