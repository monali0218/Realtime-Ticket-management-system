package CLI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketSellingSystem {
    public static void main(String[] args) {
        int option=0;

        switch (option) {
            case 1:

        }
    }

    private static void configureTicketNumber(Scanner scanner) {
        int numberOfTickets;
        while (true) {
            try {

                System.out.println("Enter the number of tickets");
                int numberOfTicket = scanner.nextInt();
                if (numberOfTicket > 0) {
//                    return numberOfTicket;
                } else {
                    System.out.println("Invalid no of tickets please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!!");
            }
        }


    }

    public static void configureTicketReleaseRate(Scanner scanner) {
        int TicketReleaseRate;
        while (true) {
//            try {
//                System.out.println("Enter the ticket released date");
//                int configureTicketReleaseDate = scanner.nextInt();
//                if () {
//
//                }
//            }
//            }
        }
    }
}
