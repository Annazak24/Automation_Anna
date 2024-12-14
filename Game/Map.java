package Game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Map {
    private char [][] tiles;
    public Map(String path,Option option) throws IOException {
        if option = Option.BUFFER{
            BufferedReader reader =new BufferedReader(new FileReader(path));
            String line;
            int hight=Integer.parseInt(reader.readLine());
            int width= Integer.parseInt(reader.readLine());
            tiles = new char[hight][width];
            for (int i=0;i<hight; i++){
                line=reader.readLine().replaceAll("\\s+","");
                tiles[i]= line.toCharArray();
            }
            reader.close();
        }
        else {
            Scanner scanner = new Scanner(new File(path));
            int height = Integer.parseInt(scanner.nextLine());
            int width= Integer.parseInt(scanner.nextLine()):
            tiles = new char[height][width];
            for (int i = 0; i < height; i++) {
                String row = scanner.nextLine().replaceAll("\\s+","");
                tiles[i]=row.toCharArray();
            }
            scanner.close();
        }
    }
}
