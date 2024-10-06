package HotelApp;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void cleanRoom() {
        System.out.println("Housekeeping is cleaning room number: " + roomNumber);
    }

    @Override
    public void executeService() {
        cleanRoom();
    }
}
