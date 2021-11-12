import baseline.gameSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMethods {

    gameSet gameset = new gameSet();

    @Test
    void testCheckInput(){
        assertEquals(false, gameset.checkInput("1245a45"));
    }

    @Test
    void testGameSet(){
        assertEquals(1000, gameset.gameSet(3));
        assertEquals(100, gameset.gameSet(2));
        assertEquals(10, gameset.gameSet(1));
    }

}
