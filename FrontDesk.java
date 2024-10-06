package HotelApp;

public class FrontDesk {
    public void requestValetService(String plateNumber) {
        Valet valet = new Valet(plateNumber);
        valet.executeService();
    }

    public void requestHouseKeeping(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.executeService();
    }

    public void requestCartService(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.executeService();
    }
}
