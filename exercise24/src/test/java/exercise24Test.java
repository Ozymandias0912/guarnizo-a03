

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class exercise24Test {

    @Test
    void shouldCheckIfEveryItemInTheArrayIsUsed(){


        int size = 3;
        int[] used = {1, 0, 1};

        assertEquals( false, baseline.Solution24.checkAnagram(size, used));
    }

    @Test
     void testIsAnagramMethod(){
        String string1 = "cat";
        String string2 = "abc";

        assertEquals(false, baseline.Solution24.isAnagram(string1, string2));
    }




}
