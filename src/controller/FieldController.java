package controller;

import model.Field;
import data.Fields;
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

    public static ArrayList<Field> getAvailableFields() {
        ArrayList<Field> fields = new ArrayList<>();
        for (Field field : allFields) {
            if (!field.isReserved()) {
                fields.add(field);
            }
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

    public void addField(Field field) {

    }

    public void updateField(Field field) {

    }

    public void deleteField(int id) {

    }
}
