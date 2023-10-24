import org.junit.Test;

import static org.example.Main.swapLastValue;
import static org.junit.Assert.assertArrayEquals;

public class MainTest {
    @Test
    public void testProcessArray() {
        int[] actArray = {-31, -2, 19, 20, -12, 18, -24, 3, -22, -20, -28, 24, -32, -8, -32, 20, 14, -9, -10, 14, -15, -26, 13, 20, -4, -27, 24};
        int[] expArray = {-31, -2, 24, 20, -12, 18, -24, 3, -22, -20, -28, 24, -32, -8, -32, 20, 14, -9, -10, 14, -15, -26, 13, 20, -4, -27, 19};
        swapLastValue(actArray);
        assertArrayEquals(expArray, actArray);
    }
}
