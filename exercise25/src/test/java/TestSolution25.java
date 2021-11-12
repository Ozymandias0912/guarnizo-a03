/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Juan Guarnizo
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSolution25 {



    @Test
    void passwordStrength()
    {
        assertEquals(0, baseline.Solution25.passwordStrength("sa12"));
        assertEquals(1, baseline.Solution25.passwordStrength("1299"));
        assertEquals(2, baseline.Solution25.passwordStrength("ucf"));
        assertEquals(3, baseline.Solution25.passwordStrength("Guarnizo12"));
        assertEquals(4, baseline.Solution25.passwordStrength("Guarnizo12!"));
        assertEquals(5, baseline.Solution25.passwordStrength("{haha}"));
    }
}
