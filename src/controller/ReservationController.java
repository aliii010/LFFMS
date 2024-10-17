package controller;

import model.*;
import java.time.*;
import java.util.ArrayList;
import data.Reservations;

public class ReservationController {
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

        for (LocalDateTime time : field.reservedTimes()) {
            if ((time.getDayOfMonth() == date.getDayOfMonth()) && (time.getHour() == hour)) {
                System.err.println("Sorry, the field is reserved at this time.");
                return;
            }
        }

        field.reservedTimes().add(LocalDateTime.of(date, LocalTime.of(hour, 0)));
        if (duration == 2) {
            field.reservedTimes().add(LocalDateTime.of(date, LocalTime.of(hour + 1, 0)));
        }
        Reservations.reservations.add(new Reservation(1, field, player, date, hour, duration));
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
