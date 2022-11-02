import java.util.Scanner;

public class Cinema {

    public static void printNumberOfSeats(int col) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i <= col; i++) {
            System.out.print(" " + i);
        }
    }
    public static void printNumberOfRows(int row, int col) {
        System.out.println();
        for (int i = 1; i <= row; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < col; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
    }
    public static void createCinemaHall(int row, int col, boolean soldSeat) {
        printNumberOfSeats(col);
        if (!soldSeat) {
            printNumberOfRows(row, col);
        } else {

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();

        createCinemaHall(row, col, false);
    }
}