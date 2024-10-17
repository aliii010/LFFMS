package view;

import java.time.*;
import java.util.Scanner;
import controller.*;
import model.*;
import view.field_views.FieldDetailView;

public class ReservationView {
    public static void startReservation(Field field) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the day of reservation. The reservation date will be in "
                + "(" + LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue() + "-" + "Your day"
                + ")");
        int day = input.nextInt();

        LocalDate reservationDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), day);

        FieldDetailView.showReservedTimes();
        System.out.println("\n Please be sure to enter an hour that is not reserved.\n");

        System.out.println("Enter the hour of reservation in " + LocalDate.now().getYear() + "-"
                + LocalDate.now().getMonthValue() + "-" + day + "(in PM): ");
        int hour = input.nextInt();

        System.out.println("Please enter the duration of reservation (1/2 hours): ");
        int duration = input.nextInt();

        ReservationController.addReservation(
                FieldController.getFieldById(field.id()),
                AuthController.getPlayer(),
                reservationDate,
                hour,
                duration);
        System.out.println("Reservation added successfully! \n");
        PlayerView.start();
        input.close();
    }
}
