import baseline.fitness;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFitness {

    fitness fit = new fitness(22, 65);

    @Test
    public void testTargetHeartRate(){

        assertEquals(138, fit.TargetHeartRate(fit.getAge(), fit.getRestingPulse(), 55));
    }
}
