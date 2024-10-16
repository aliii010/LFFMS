package controller;

import model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import data.Reservations;

public class ReservationController {
    public static void addReservation(Field field, Player player, LocalDate date, int duration) {
        // if (field.isReserved()) {
        // System.err.println("Field is already reserved. Please choose another
        // field.");
        // return;
        // }

        if (duration > 2) {
            System.err.println("Sorry, you can't reserver a field for more than 2 hours.");
            return;
        }

        Reservations.reservations.add(new Reservation(1, field, player, date, duration));
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
