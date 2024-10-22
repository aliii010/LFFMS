package controller;

import model.Player;
import view.PlayerView;

public class AuthController {
    private static Player player;

    public static void addPlayer(String username, String phoneNumber, String password) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be blank");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\+?[0-9]+")) {
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        if (password == null || username.isBlank()) {
            throw new IllegalArgumentException("Password cannot be blank");
        }

        player = new Player(username, phoneNumber, password, "Player", 1);
        System.out.println("You have successfully registered! as " + username + " " + phoneNumber);
        PlayerView.start();
    }

    public static void signInPlayer(String phoneNumber, String password) {
        player = new Player("blnd", phoneNumber, password, "Player", 1);
    }

    public static Player getPlayer() {
        return player;
    }

    public static boolean isPlayer(String phoneNumber, String password) {
        if (phoneNumber.equals("07512040914") && password.equals("blnd")) {
            return true;
        }
        return false;
    }

    public static boolean isFieldOwner(String phoneNumber, String password) {
        if (phoneNumber.equals("07512040914") && password.equals("blnd00")) {
            return true;
        }
        return false;
    }
}
