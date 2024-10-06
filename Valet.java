package HotelApp;

public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void pickUpVehicle() {
        System.out.println("Valet is picking up vehicle with plate number: " + plateNumber);
    }

    @Override
    public void executeService() {
        pickUpVehicle();
    }
}
