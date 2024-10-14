package view;

import model.Player;
import controller.AuthController;

import java.util.Random;
import java.util.Scanner;

public class SignUpView {
    static String phoneNumber;
    String password;
    static String userName;

    public static void start() {
        System.out.println("Register as a user :");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username : ");
        userName = input.nextLine();

        System.out.println("Enter your Phone Number: ");
        phoneNumber = input.nextLine();

        System.out.println("Enter your password : ");
        String password = input.nextLine();

        AuthController.addPlayer(userName, phoneNumber, password);

        System.out.println("You have successfully registered! as " + userName + " " + phoneNumber);
        PlayerView.start();
    }
}
