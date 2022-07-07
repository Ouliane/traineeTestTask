import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private final String CONST = "newValue";
    private final static String bd = "pui";

    @Test
    public void equalsOneToOneString() {
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar() {
        assertEquals("newValue", CONST);
    }

    @Test
    public void equalsOneToOneInt() {
        assertEquals(1, 1);
    }


    @Test
    public void stringsMustBeEquals() {
        String res = "a";

        if (bd.equals(new String("pui"))) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList() {
        List<String> sourceData = new ArrayList<>(List.of("1", "viskas", "chupocabra"));
        sourceData.clear();
        assertFalse(sourceData.contains("1"));
    }
}
