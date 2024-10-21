package controller;

import model.Field;
import data.Fields;

import java.io.*;
import java.util.ArrayList;

public class FieldController {
    // dummy data
    static Field[] allFields = Fields.allFields;

    public static ArrayList<Field> getAllFields() {
        ArrayList<Field> fields = new ArrayList<>();
        for (Field field : allFields) {
            fields.add(field);
        }
        return fields;
    }

    public static Field getFieldById(int id) {
        for (Field field : allFields) {
            if (field.id() == id) {
                return field;
            }
        }
        System.err.println("Field not found");
        return null;
    }

    public static void addField(Field field) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/data/fields.txt", true))) {
            writer.println(field);
        } catch (IOException e) {
            System.err.println("Error adding field to file: " + e.getMessage());
            return;
        }

        System.out.println("Field added successfully");
    }

    public void updateField(Field field) {

    }

    public void deleteField(int id) {

    }
}
