import jdk.jfr.Name;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class String_ReverserTest {

    private String_Reverser string_reverser;

    @Before
    public void setUp(){
        this.string_reverser = new String_Reverser();
    }

    @Test
    public void whenGivenSingleStringSentenceReturnsWordsInReverse(){

        String singleSentence = "we are the music makers";

         String expectedResult = "makers music the are we";

         String actualResult = string_reverser.reverseString(singleSentence);

        System.out.println(actualResult);

         assertEquals(expectedResult, actualResult);

    }

}