package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    // In your code, add a second test (testSubtraction) that checks that the subtract method works
    //  using the same pattern as the testAddition method (assertEquals method). Test should fail.
    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }

}
