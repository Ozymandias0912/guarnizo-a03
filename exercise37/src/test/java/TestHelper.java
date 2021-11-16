import baseline.helper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHelper {

    @Test
    public void testCreatePassword(){

        helper help = new helper();

        String password = help.createPassword(8,1,1);

        assertTrue(8 <= password.length());

        assertTrue(help.hasDigit(password));

        assertTrue(help.hasSpecialCharacter(password));

    }
}
