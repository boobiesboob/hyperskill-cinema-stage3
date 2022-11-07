import java.util.Scanner;

public class Cinema {
    private static Scanner scanner = new Scanner(System.in);
    private static final int PREMIUM_SEAT_PRICE = 10;
    private static final int ECONOMY_SEAT_PRICE = 8;
    private static final int SEATS_MERIDIAN = 60;
    private static int hallRows;
    private static int hallColumns;
    private static int boughtSeatInRow;
    private static int boughtSeatInColumn;
    public static void defineHallSize() {

        System.out.println("Enter the number of rows:");
        int hallRows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int hallColumns = scanner.nextInt();
    }
    public static void printCinemaHall() {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= hallColumns; i++) {
            System.out.print(" " + i);
        }

        System.out.println();
        for (int i = 1; i <= hallRows; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < hallColumns; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
    }
    public static void defineSeatToBuy() {
        System.out.println("Enter a row number:");
        boughtSeatInRow = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        boughtSeatInColumn = scanner.nextInt();
    }
    public static int calculateSeatPrice() {
        int ticketPrice;
        int boughtSeat = boughtSeatInRow * boughtSeatInColumn;
        int frontSeats;
        int backSeats;

        if (boughtSeat <= SEATS_MERIDIAN) {
            ticketPrice = boughtSeat * PREMIUM_SEAT_PRICE;
        } else {
            frontSeats = boughtSeatInRow / 2 * boughtSeatInColumn;
            backSeats = boughtSeat - frontSeats;
            ticketPrice = frontSeats * PREMIUM_SEAT_PRICE + backSeats * ECONOMY_SEAT_PRICE;
        }
        return ticketPrice;
    }
    public static void printTicketPrice() {
        int price = calculateSeatPrice();
        System.out.println("Ticket price: " + price);
    }
    public static void showBoughtSeatInHall () {

    }
    public static void main(String[] args) {
        defineHallSize();
        printCinemaHall();
        defineSeatToBuy();
        calculateSeatPrice();
        printTicketPrice();

    }
}