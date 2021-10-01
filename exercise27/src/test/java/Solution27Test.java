import baseline.Employee;
import baseline.Solution27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution27Test {
    @Test
    void testCheckFirstName() {
        assertEquals(true, Employee.checkFirstName("Juan"));
    }
}