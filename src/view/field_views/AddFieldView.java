package view.field_views;

import java.util.*;
import controller.FieldController;
import model.Field;
import view.FieldOwnerView;
import data.Fields;

public class AddFieldView {

    public static void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello " + Fields.greatestId);

        System.out.println("=====Add Field=====");
        System.out.print("Enter field name: ");
        String name = input.nextLine();
        System.out.print("Enter field location: ");
        String location = input.nextLine();
        System.out.print("Enter field description: ");
        String description = input.nextLine();
        System.out.print("Enter field price: ");
        double price = input.nextDouble();
        System.out.print("Enter field player capacity: ");
        int playerCapacity = input.nextInt();

        Field field = new Field(Fields.greatestId + 1, name, location, description, price, playerCapacity,
                new ArrayList<>());

        FieldController.addField(field);
        FieldOwnerView.start();

        input.close();
    }
}
