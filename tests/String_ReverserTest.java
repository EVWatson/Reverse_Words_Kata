import org.junit.Test;

import static org.junit.Assert.*;

public class String_ReverserTest {

    @Test
    public void whenGivenSingleStringSentenceReturnsWordsInReverse(){

        String singleSentence = "we are the music makers";

         String expectedResult = "makers music the are we";

         String actualResult = reverseString(singleSentence);

         assertEquals(expectedResult, actualResult);

    }

}