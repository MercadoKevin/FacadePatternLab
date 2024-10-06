package HotelApp;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    public void requestCart() {
        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }

    @Override
    public void executeService() {
        requestCart();
    }
}
