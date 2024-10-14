package data;

import model.Field;

public class Fields {
    // dummy data
    public static Field[] allFields = {
            new Field(1, "Green Park", "New York", "A well-maintained soccer field", 200.0, 22, false),
            new Field(2, "Sunny Meadows", "Los Angeles", "A beautiful field with a view of the mountains", 150.0, 20,
                    true),
            new Field(3, "Ocean Breeze", "Miami", "A field near the ocean with cool breezes", 180.0, 18, false),
            new Field(4, "Central Arena", "Chicago", "A large multipurpose field in the city center", 250.0, 30, true),
            new Field(5, "Sunset Fields", "San Francisco", "A scenic field overlooking the bay", 220.0, 25, false)
    };
}
