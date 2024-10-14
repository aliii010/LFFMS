package view;

import java.time.LocalDate;
import java.util.Scanner;
import controller.*;
import model.Reservation;

public class ReservationView {
    static void startReservation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the id of the field you want to reserve: ");
        int id = input.nextInt();
        System.out.println("Please enter the date of reservation (yyyy-mm-dd): ");
        String dateInString = input.next();
        LocalDate date = LocalDate.parse(dateInString);
        System.out.println("Please enter the duration of reservation (in hours): ");
        int duration = input.nextInt();
        ReservationController.addReservation(FieldController.getFieldById(id), AuthController.getPlayer(), date,
                duration);
        System.out.println("Reservation added successfully!");
    }

    static void showPlayerReservations() {
        if (ReservationController.getReservationsByPlayer(AuthController.getPlayer()).isEmpty()) {
            System.out.println("You have no reservations");
            return;
        }
        for (Reservation reservation : ReservationController.getReservationsByPlayer(AuthController.getPlayer())) {
            System.out.println(reservation);
        }
    }

    public static void start() {
        System.out.println("Please select\n [1] Start reservation [2] Show my reservations [3] Exit");
        Scanner input = new Scanner(System.in);
        int userAnswer = input.nextInt();
        if (userAnswer == 1) {
            startReservation();
        } else if (userAnswer == 2) {
            showPlayerReservations();
        } else {
            System.exit(1);
        }
    }
}
