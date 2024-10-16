package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public record Field(
        int id,
        String name,
        String location,
        String description,
        double price,
        int playerCapacity,
        ArrayList<LocalDateTime> reservedTimes) {
}