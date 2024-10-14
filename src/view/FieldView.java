package view;

import java.util.Scanner;

import controller.FieldController;
import model.Field;

public class FieldView {
    static void showAllFields() {
        System.out.println("======All fields in our system=====\n");

        System.out.printf("%-5s %-15s %-15s %-40s %-10s %-15s %-10s%n",
                "ID", "Name", "Location", "Description", "Price", "Capacity", "Reserved");

        System.out.println("-------------------------------------------------------------------------------");

        for (Field field : FieldController.getAllFields()) {
            System.out.printf("%-5d %-15s %-15s %-40s %-10.2f %-15d %-10s%n",
                    field.id(), field.name(), field.location(), field.description(),
                    field.price(), field.playerCapacity(), field.isReserved() ? "Yes" : "No");
        }
    }

    static void showAvailableFields() {
        System.out.println("======Available fields in our system=====\n");

        System.out.printf("%-5s %-15s %-15s %-40s %-10s %-15s %-10s%n",
                "ID", "Name", "Location", "Description", "Price", "Capacity", "Reserved");

        System.out.println("-------------------------------------------------------------------------------");

        for (Field field : FieldController.getAvailableFields()) {
            System.out.printf("%-5d %-15s %-15s %-40s %-10.2f %-15d %-10s%n",
                    field.id(), field.name(), field.location(), field.description(),
                    field.price(), field.playerCapacity(), field.isReserved() ? "Yes" : "No");
        }
    }

    static void reserveField() {
        ReservationView.start();
    }

    public static void start() {
        System.out.println("Welcome to field view");
        while (true) {
            System.out.println("Please select\n [1] Show all fields [2] show available fields [3] Reserve [4] Exit");
            Scanner input = new Scanner(System.in);
            int userAnswer = input.nextInt();
            if (userAnswer == 1) {
                showAllFields();
                continue;
            } else if (userAnswer == 2) {
                showAvailableFields();
                continue;
            } else if (userAnswer == 3) {
                reserveField();
                continue;
            } else {
                System.exit(1);
            }
            input.close();
        }
    }
}
