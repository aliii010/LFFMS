package model;

import java.time.*;

public record Reservation(
        int id,
        Field field,
        Player player,
        LocalDate date,
        int hour,
        int duration) {
}
