package view;

import controller.AuthController;
import controller.ReservationController;
import model.Reservation;
import view.field_views.*;
import java.util.*;

public class PlayerView {
    static void showPlayerReservations() {
        if (ReservationController.getReservationsByPlayer(AuthController.getPlayer()).isEmpty()) {
            System.out.println("You have no reservations");
        } else {
            for (Reservation reservation : ReservationController.getReservationsByPlayer(AuthController.getPlayer())) {
                System.out.println(reservation);
            }
        }
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Player View=====");

        System.out.println("Please select\n [1] Go to fields [2] Show my reservations [3] Exit");
        int userAnswer = input.nextInt();
        if (userAnswer == 1) {
            FieldView.showFieldNames();
        } else if (userAnswer == 2) {
            showPlayerReservations();
        } else {
            System.exit(1);
        }
        input.close();
    }
}
