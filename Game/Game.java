package Game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Game implements Recordable{ {
        private Map map;
        private  Role[] roles;
        private  Item[] items;

        public new Game(Map map, Role[] roles, Item[] items){
            this.map = map;
            this.roles = roles;
            this.items = items;
        }

    }

    @Override
    public void record(String path) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write("Map: map.txt\n");
            map.record("map.txt");
        }
    }

    @Override
    public void record() {

    }
}
