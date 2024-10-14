package view;
import controller.AuthController;
import java.util.Scanner;

public class SignInView {
    public static String getRole(){
        Scanner input = new Scanner(System.in);
        String phoneNumber, password;
        System.out.println("Log in");
        System.out.print("Enter Phone Number: ");
        phoneNumber = input.nextLine();
        System.out.print("Enter Password: ");
        password = input.nextLine();
        boolean isPlayer=AuthController.isPlayer(phoneNumber,password);
        boolean isFieldOwner=AuthController.isFieldOwner(phoneNumber,password);
        if(isPlayer){
            return "Player";
        }
        else if(isFieldOwner){
            return "FieldOwner";
        }
        else {
            System.out.println("Incoreect Phone number or Password");
            return "";
        }
    }

}
