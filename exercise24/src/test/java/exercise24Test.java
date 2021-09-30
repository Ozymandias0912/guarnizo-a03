
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class exercise24Test {

    @Test
    void shouldCheckIfEveryItemInTheArrayIsUsed(){


        int size = 3;
        int[] used = {1, 0, 1};

        Assertions.assertEquals( false, baseline.Solution24.checkAnagram(size, used));
    }

    @Test
     void testIsAnagramMethod(){
        String string1 = "cat";
        String string2 = "abc";

        Assertions.assertEquals(false, baseline.Solution24.isAnagram(string1, string2));
    }




}
