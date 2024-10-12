package model;

public record Player(
        int id,
        String username,
        String password,
        String phoneNumber) {

    public Player {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank.");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters long.");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\+?[0-9]+")) {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
    }
}
