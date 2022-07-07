import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() {
        Path path = Path.of("./src/test/resources/ReadFileTests.txt");
        try {
            List<String> list = Files.readAllLines(path);
            assertEquals(list.get(1), "аллоха");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}