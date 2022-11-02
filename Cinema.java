import java.util.Scanner;

public class Cinema {
    public static void createCinemaHall(int row, int col, boolean soldSeat) {
        System.out.println("Cinema:");
        for (int i = 0; i < col; i++) {
            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();


    }
}