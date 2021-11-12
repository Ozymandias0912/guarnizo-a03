import baseline.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution27Test {

    Employee Juan = new Employee("a", "b", "HK-4512", 32828);
    @Test
    void testCheckFirstName() {
        assertEquals(false, Juan.checkFirstName(Juan.getFirstName()));
    }
    @Test
    void testCheckLastName() {
        assertEquals(false, Juan.checkLastName(Juan.getLastName()));
    }

    @Test
    void testCheckID() {
        assertEquals(true, Juan.checkID(Juan.getID()));
    }


}