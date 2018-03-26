import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShiftingTest {

    Shifting test = new Shifting();

    @Test
    public void shouldShiftWithThreePosition() {
        int[] testNumbers = {5, 8, 21, 45, 76, 89, 110};
        int shifter = 4;
        int[] result = {45, 76, 89, 110, 5, 8, 21};

        assertEquals(Arrays.toString(test.shiftingElements(shifter, testNumbers)),Arrays.toString(result));
    }

}