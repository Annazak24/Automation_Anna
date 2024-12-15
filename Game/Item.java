package Game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Item implements Recordable {
    private String name;
    private int coordX = -1, coordY = -1;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public void record(String path) throws IOException {
        try (BufferedWriter writer = new BufferedWriter((new FileWriter(path)))) {
            writer.write("Item:" + name + "\n");
            writer.write(("Coordinates: " + coordX + "," + coordY));

        }


    }
}
