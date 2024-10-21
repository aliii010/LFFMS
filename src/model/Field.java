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
    @Override
    public String toString() {
        return id + "," +
                name + "," +
                location + "," +
                description + "," +
                price + "," +
                playerCapacity + ",";
    }
}