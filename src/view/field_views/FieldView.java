package view.field_views;

import java.util.Scanner;
import model.Field;
import controller.FieldController;
import view.*;

public class FieldView {

    public static void showFieldNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("======All fields in our system=====\n");

        for (Field field : FieldController.getAllFields()) {
            System.out.println("[" + field.id() + "]" + field.name() + "\n");
        }
        System.out.println("[0] Back");

        int selectedField = input.nextInt();
        if (selectedField == 0) {
            PlayerView.start();
        } else {
            FieldDetailView.start(selectedField);
        }
        input.close();
    }
}
