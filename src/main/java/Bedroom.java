import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNumber;
    RoomType roomType;




    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;


    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
