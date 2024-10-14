package model;

public record Field(
        int id,
        String name,
        String location,
        String description,
        double price,
        int playerCapacity,
        boolean isReserved) {
}