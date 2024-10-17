package view;

import java.util.Scanner;

public class StartingView {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("*****Welcome to LFFMS*****");
        while (true) {
            System.out.println("Please select\n [1] Sign up [2] Sign in [3] Exit");
            int userAnswer = input.nextInt();
            if (userAnswer == 1) {
                SignUpView.start();
                break;
            } else if (userAnswer == 2) {
                SignInView.start();
                break;
            } else {
                System.out.println("Are you sure to exit the program?\n [1] Yes [2] No");
                int exitAnswer = input.nextInt();
                if (exitAnswer == 1) {
                    System.out.println("System Exited");
                    break;
                }
            }
        }
        input.close();
    }
}
