import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guestsInRoom;

    private int capacity;

    public Room(int capacity) {
        this.guestsInRoom = new ArrayList<Guest>();
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestsInRoom() {
        return guestsInRoom;
    }
    public int getNumberOfGuestsInRoom() {
        return guestsInRoom.size();
    }
    public int getCapacity() {
        return capacity;
    }

    public void setGuestsInRoom(ArrayList<Guest> guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }

    public void addGuestToRoom(Guest guestToAdd){
        this.guestsInRoom.add(guestToAdd);
    }

    public void removeGuestFromRoom(Guest guestToRemove){
        this.guestsInRoom.remove(guestToRemove);
    }


}
