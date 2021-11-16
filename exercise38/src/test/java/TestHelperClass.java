/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */

import baseline.helperClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHelperClass {

    @Test
    public void testFilterEvenNumbers(){

        helperClass helper = new helperClass();

        String input = "1 2 3 4";

        assertTrue(" 2 4".equals(helper.filterEvenNumbers(input)));
    }
}
