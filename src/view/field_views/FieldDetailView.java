package view.field_views;

import data.Fields;
import model.Field;
import java.util.*;
import java.time.LocalDateTime;
import view.ReservationView;

public class FieldDetailView {
    static Scanner input = new Scanner(System.in);
    static Field[] allFields = Fields.allFields;
    static Field field;

    static void getField(int id) {
        for (Field field : allFields) {
            if (field.id() == id) {
                FieldDetailView.field = field;
            }
        }
    }

    static void showFieldDetails() {
        System.out.println("Field name: " + field.name());
        System.out.println("Location: " + field.location());
        System.out.println("Description: " + field.description());
        System.out.println("Price: " + field.price());
        System.out.println("Player capacity: " + field.playerCapacity());
        if (!field.reservedTimes().isEmpty()) {
            System.out.println("Reserved times: ");
            for (LocalDateTime time : field.reservedTimes()) {
                System.out.println(time);
            }
        } else {
            System.out.println(field.name() + " is available at all times.");
        }

        System.out.println("Please select\n [1] Reserve " + field.name() + " [2] Back");
        int answer = input.nextInt();

        if (answer == 1) {
            ReservationView.startReservation(field);
        } else {
            FieldView.showFieldNames();
        }
    }

    public static void start(int id) {
        getField(id);
        showFieldDetails();
    }
}