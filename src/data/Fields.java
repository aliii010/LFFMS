package data;

import model.Field;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Fields {
    public static ArrayList<Field> allFields = new ArrayList<>();
    public static int greatestId = 0;

    public static void loadFields() {
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/data/fields.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                String location = values[2];
                String description = values[3];
                double price = Double.parseDouble(values[4]);
                int playerCapacity = Integer.parseInt(values[5]);

                allFields.add(new Field(id, name, location, description, price, playerCapacity, new ArrayList<>()));
                greatestId = id;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}