package view;

import java.time.*;
import java.util.Scanner;
import controller.*;
import model.*;

public class ReservationView {
    public static void showReservedTimesInDate(Field field, LocalDate reservationDate) {
        if (field.reservedTimes().isEmpty()) {
            System.out.println(field.name() + " is available at all times. \n");
            return;
        }

        boolean hasReservationsOnDate = false;
        for (LocalDateTime time : field.reservedTimes()) {
            if (time.toLocalDate().equals(reservationDate)) {
                System.out.println("\n" + time.getHour() + "PM " + "to " + (time.getHour() + 1) + "PM is reserved.\n");
                hasReservationsOnDate = true;
            }
        }

        if (!hasReservationsOnDate) {
            System.out.println(field.name() + " is available at all times in " + reservationDate + ".\n");
        } else {
            System.out.println("\nPlease be sure to enter an hour that is not reserved.\n");
        }
    }

    public static void startReservation(Field field) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the day of reservation. The reservation date will be in "
                + "(" + LocalDate.now().getYear() + "-" + LocalDate.now().getMonthValue() + "-" + "Your day"
                + ")");
        int day = input.nextInt();

        LocalDate reservationDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), day);

        showReservedTimesInDate(field, reservationDate);

        System.out.println("Enter the hour of reservation in " + LocalDate.now().getYear() + "-"
                + LocalDate.now().getMonthValue() + "-" + day + "(in PM): ");
        int hour = input.nextInt();

        System.out.println("Please enter the duration of reservation (1/2 hours): ");
        int duration = input.nextInt();

        if (ReservationController.isTimeSlotReserved(field, reservationDate, hour, duration)) {
            ReservationView.startReservation(field);
        }

        ReservationController.addReservation(
                FieldController.getFieldById(field.id()),
                AuthController.getPlayer(),
                reservationDate,
                hour,
                duration);

        PlayerView.start();
        input.close();
    }
}
