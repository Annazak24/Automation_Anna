package Game;

import java.io.IOException;

public interface Recordable {
    void record (String path) throws IOException;

    void record()
}
