import baseline.helperClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class testHelperClass {



    @Test
    public void testAverage(){

        ArrayList<Double> list = new ArrayList<>();

        for(double i = 0; i < 10; i++){

            list.add(i);
        }

        helperClass helper = new helperClass(list);

        assertEquals(4.50, helper.average(list));

    }

    @Test
    public void testMin(){
        ArrayList<Double> list = new ArrayList<>();

        for(double i = 0; i < 10; i++){

            list.add(i);
        }

        helperClass helper = new helperClass(list);

        assertEquals(0.0, helper.min(list));
    }

    @Test
    public void testMax(){
        ArrayList<Double> list = new ArrayList<>();

        for(double i = 0; i < 10; i++){

            list.add(i);
        }

        helperClass helper = new helperClass(list);

        assertEquals(9.0, helper.max(list));
    }

    @Test
    public void testStd(){
        ArrayList<Double> list = new ArrayList<>();

        for(double i = 0; i < 10; i++){

            list.add(i);
        }

        helperClass helper = new helperClass(list);

        assertEquals(2.87, helper.std(list), .01);
    }
}
