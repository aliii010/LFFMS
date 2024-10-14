package view;

import model.Player;

import java.util.Random;
import java.util.Scanner;

public class SignUpView {
    static String phoneNumber;
    String password;
    static String userName;
    public static void start() {
        while (true) {
            System.out.println("Register as a user :");
            Random rand = new Random();
            int randomId=rand.nextInt(100);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username : ");
            userName = input.nextLine();
            if(userName==null||userName.isBlank()){
                throw new IllegalArgumentException("Username cannot be blank");
            }
            System.out.println("Enter your Phone Number: ");
            phoneNumber = input.nextLine();
            if(phoneNumber == null || !phoneNumber.matches("\\+?[0-9]+")){
                throw new IllegalArgumentException("Invalid Phone Number");
            }
            System.out.println("Enter your password : ");
            String password = input.nextLine();
            if(password==null||userName.isBlank()){
                throw new IllegalArgumentException("Password cannot be blank");
            }
            Player player = new Player(userName,phoneNumber,password,"User", randomId);
            break;
        }
        System.out.println("You have successfully registered! as " + userName+" "+ phoneNumber);
        PlayerView.start();
    }
}
