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
    public void whenReverseWordsInStringIsGivenSingleStringSentenceReturnsWordsInReverse(){

        String singleSentence = "we are the music makers";

         String expectedResult = "makers music the are we";

         String actualResult = string_reverser.reverseWordsInString(singleSentence);

        System.out.println(actualResult);

         assertEquals(expectedResult, actualResult);

    }



    @Test
    public void whenReverseWordsInStringIsGivenStringContainingPunctuationReturnsWordsInReverseWithPunctuationStayingNextToWordFromOriginalOrder(){
        String singleSentence = "we are the music makers,";

        String expectedResult = "makers, music the are we";

        String actualResult = string_reverser.reverseWordsInString(singleSentence);

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void reverseLinesInParagraphReturnsEachReversedLineInOrder(){
        String paragraph = "We are the music makers,\nand we are the dreamers of dreams,";
        String expectedResult = "makers, music the are We\ndreams, of dreamers the are we and";
        String actualResult = string_reverser.reverseLinesInParagraph(paragraph);

        System.out.println(actualResult);

        assertEquals(expectedResult, actualResult);
    }

}