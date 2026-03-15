
public class MovieTicket {
    String movieName;
    String seatNumber;
    int price;
    public void bookTicket(String name, String seat, int ticketPrice) {
        movieName = name;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully");
    }
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Intersteller", "A12", 250);
        ticket.displayTicketDetails();
    }
}