package HotelApp;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        //  The Guest requests services through the FrontDesk facade
        frontDesk.requestValetService("ABC-1234");
        frontDesk.requestHouseKeeping(123);
        frontDesk.requestCartService(1);
    }
}
