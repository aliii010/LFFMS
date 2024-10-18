package controller;

import model.*;
import java.time.*;
import java.util.ArrayList;
import data.Reservations;

public class ReservationController {
    public static boolean isTimeSlotReserved(Field field, LocalDate date, int hour, int duration) {
        for (LocalDateTime time : field.reservedTimes()) {
            if (time.toLocalDate().equals(date)) {
                int reservedHour = time.getHour();

                // Check if the requested hour or the next hour (in case of 2-hour duration) is
                // already reserved
                if (reservedHour == hour || (duration == 2 && reservedHour == hour + 1)) {
                    System.err.println(
                            "Sorry, the field is already reserved at " + reservedHour + " PM. Please try again.");
                    return true;
                }
            }
        }
        return false;
    }

    public static void addReservation(
            Field field,
            Player player,
            LocalDate date,
            int hour,
            int duration) {
        if (duration > 2) {
            System.err.println("Sorry, you can't reserver a field for more than 2 hours.");
            return;
        }

        field.reservedTimes().add(LocalDateTime.of(date, LocalTime.of(hour, 0)));
        if (duration == 2) {
            field.reservedTimes().add(LocalDateTime.of(date, LocalTime.of(hour + 1, 0)));
        }
        Reservations.reservations.add(new Reservation(1, field, player, date, hour, duration));
        System.out
                .println("Reservation made successfully for " + hour + "PM " + "to " + (hour + 1) + "PM. in " + date);
    }

    public static ArrayList<Reservation> getReservationsByPlayer(Player player) {
        ArrayList<Reservation> reservationsByPlayer = new ArrayList<>();
        for (Reservation reservation : Reservations.reservations) {
            if (reservation.player() == player) {
                reservationsByPlayer.add(reservation);
            }
        }
        return reservationsByPlayer;
    }
}
