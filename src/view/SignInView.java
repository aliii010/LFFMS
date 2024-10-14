package view;

import controller.AuthController;

import java.lang.ref.PhantomReference;
import java.util.Scanner;

public class SignInView {

    public static void start() {
        Scanner input = new Scanner(System.in);
        String phoneNumber, password;
        System.out.println("Log in");
        System.out.print("Enter Phone Number: ");
        phoneNumber = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();

        AuthController.signInPlayer(phoneNumber, password);
        System.out.println("You have successfully signed in! as " + "blnd" + " " + phoneNumber);

        String role = getRole(phoneNumber, password);
        if (role.equalsIgnoreCase("Player")) {
            PlayerView.start();
        } else if (role.equalsIgnoreCase("FieldOwner")) {
            FieldOwnerView.start();
        }
    }

    public static String getRole(String phoneNumber, String password) {
        boolean isPlayer = AuthController.isPlayer(phoneNumber, password);
        boolean isFieldOwner = AuthController.isFieldOwner(phoneNumber, password);
        if (isPlayer) {
            return "Player";
        } else if (isFieldOwner) {
            return "FieldOwner";
        } else {
            System.out.println("Incoreect Phone number or Password");
            return "";
        }
    }
}
