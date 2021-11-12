import baseline.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSolution29 {

    Calculator calculator = new Calculator();

    @Test
    void TestisDigit(){
        assertEquals(false, calculator.isDigit('a')) ;
    }

    @Test
    void TestCheckInput(){
        assertEquals(true, calculator.checkInput("2.15")) ;
    }


}
