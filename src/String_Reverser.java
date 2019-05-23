import java.lang.reflect.Array;
import java.util.*;

public class String_Reverser {

    /*
    Ways to reverse strings:

    1. separate into array of words (regex on white space), then loop through backwards. discovered .trim() method to get rid of space at end of new string
    2. array.reverse method? doesn't seem to exist. at least not on primitive array.
    3. StringBuilder .reverse method - only does characters
    4. Pattern class - doesn't seem to make much difference to option 1
    5. invert array? probably not necessary
    6. collection.reverse - can't seem to get a string back.
     */


    //    reversing an array with a for loop

    public String reverseLinesInParagraph(String paragraph){
        String[] separatedLines = paragraph.split("\\r?\\n");
        String reversedParagraph = "";
        for(int line = 0; line < separatedLines.length; line++){
           String reversedLine = reverseWordsInString(separatedLines[line]);
            reversedParagraph = reversedParagraph.concat(reversedLine + "\n");
        }
        return reversedParagraph.stripTrailing();
    }

    public String reverseWordsInString(String sentence) {
        String[] sentenceSplitIntoWords = sentence.split(" ");
        String sentenceInReverse = "";
        for (int word = sentenceSplitIntoWords.length - 1; word >= 0; word--) {
            sentenceInReverse = sentenceInReverse.concat(sentenceSplitIntoWords[word] + " ");
        }
        return sentenceInReverse.trim().replaceAll("\\s{2,}", " " );
    }



}
