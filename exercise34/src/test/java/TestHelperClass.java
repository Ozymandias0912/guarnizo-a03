import baseline.helperClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class TestHelperClass {

    @Test
    void testRemove(){
        helperClass helper = new helperClass();

        ArrayList<String> Employees = new ArrayList<>();

        Employees.add("Brayan Castiblanco");
        Employees.add("Sofia Puerta");
        Employees.add("Andres Avila");
        Employees.add("Mariana Pastrana");
        Employees.add("Daniela Ostos");

        helper.remove("Andres Avila", Employees);

        assertEquals(4,Employees.size());

        helper.remove("Mariana Pastrana", Employees);

        assertEquals(3,Employees.size());
    }
}
