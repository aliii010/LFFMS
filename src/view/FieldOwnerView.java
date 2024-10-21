package view;

import java.util.Scanner;
import view.field_views.*;

public class FieldOwnerView {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("=====Field Owner View=====");

        System.out
                .println("Please select\n [1] Add Field [2] Update Field [3] Delete Field [4] Show My Fields [0] Exit");
        int userAnswer = input.nextInt();
        if (userAnswer == 1) {
            AddFieldView.start();
        }
        input.close();
    }
}
