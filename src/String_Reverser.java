public class String_Reverser {

    /*
    Ways to reverse strings:

    1. separate into array of words (regex on white space), then loop through backwards. discovered .trim() method to get rid of space at end of new string
    2. array.reverse method?
    3. StringBuilder .reverse method
    4. Pattern class
     */


//    reversing an array with a for loop
    public String reverseString(String sentence){
        String[] sentenceSplitIntoWords = sentence.split(" ");
        String sentenceInReverse = "";
        for(int word = sentenceSplitIntoWords.length -1; word >= 0; word --){
           sentenceInReverse = sentenceInReverse.concat(sentenceSplitIntoWords[word] + " ");
        }
        return sentenceInReverse.trim();
    }



}
