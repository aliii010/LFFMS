package view.field_views;

import java.util.Scanner;
import model.Field;
import controller.FieldController;

public class FieldView {
    static Scanner input = new Scanner(System.in);

    static void showFieldNames() {
        System.out.println("======All fields in our system=====\n");
        System.out.println("Please select the field you want to reserve: ");

        for (Field field : FieldController.getAllFields()) {
            System.out.println("[" + field.id() + "]" + field.name() + "\n");
        }

        int selectedField = input.nextInt();
        FieldDetailView.start(selectedField);
    }

    public static void start() {
        System.out.println("Welcome to field view");
        System.out.println("Please select\n [1] Show all fields [2] Exit");
        int userAnswer = input.nextInt();
        if (userAnswer == 1) {
            showFieldNames();
        } else {
            System.exit(1);
        }

    }
}
