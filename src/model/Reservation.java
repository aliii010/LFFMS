package model;

import java.time.LocalDate;

public record Reservation(
        int id,
        Field field,
        Player player,
        LocalDate date,
        int duration) {
}
