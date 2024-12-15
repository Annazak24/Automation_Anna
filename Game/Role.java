package Game;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Role implements Recordable {
    private Stats stats;
    private int posX,posY;
    private String[] inventory;
    public Role (Stats stats){
        this.stats= stats;
        this.posY = -1;
        this.posX = -1;
        this.inventory = new String[0];
    }
    @Override
    public void record(String path) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(this.getClass().getSimpleName() + "\n");
            writer.write(stats.toString() + "/n");
            writer.write("Position: " + posX + ", "+ posY + "\n");
            writer.write("Inventory: " + String.json(", ", inventory));
        }
    }
}
