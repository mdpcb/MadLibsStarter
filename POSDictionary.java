import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This class provides information about the parts of speech of words. It
 * provides methods for generating random words of a particular type, and
 * methods for checking the part of speech for a provided word.
 * 
 * @author Nathan Sprague and ???
 * @version 3/30/15
 */
public class POSDictionary
{
    private Random generator;

    // DECLARE FOUR ARRAY LISTS TO CONTAIN NOUNS, VERBS, ADJECTIVES AND ADVERBS

    /**
     * Instantiate a POSDictionary from a dictionary file. Each word will be on
     * a single line, with a comma separating the word from a part of speech
     * identifier. For example:
     * 
     * pose,V
     * 
     * Indicates that the word "pose" is a verb. The four recognized part of
     * speech identifiers are:
     * 
     * N - Noun 
     * V - Verb 
     * A - Adjective 
     * v - Adverb
     * 
     * Unrecognized parts of speech will be ignored. Each word will be
     * associated with only one part of speech.
     * 
     * @param posFile - File name of the dictionary file
     * @throws FileNotFoundException - if the file cannot be opened for reading
     */
    public POSDictionary(String posFile) throws FileNotFoundException
    {
        generator = new Random();

        // UNFINISHED.
        // INSTANTIATE ARRAY LISTS HERE.

        loadFile(posFile);
    }

    /**
     * Helper method for loading the file. See constructor Javadoc for file
     * format.
     * 
     *   UNFINISHED.
     * 
     * @param posFile - File name of the dictionary file
     * @throws FileNotFoundException - if the file cannot be opened for reading
     */
    private void loadFile(String posFile) throws FileNotFoundException
    {
        Scanner sc;
        String curLine, word, pos;
        String[] splitLine;

        sc = new Scanner(new File(posFile));

        while (sc.hasNextLine())
        {
            curLine = sc.nextLine();
            splitLine = curLine.split(",");
            word = splitLine[0];
            pos = splitLine[1];

            // INSERT EACH WORD INTO THE APPROPRIATE ARRAYLIST.
            // THIS IS A GOOD PLACE FOR A SWITCH STATEMENT.

        }
        sc.close();
    }

    /**
     * Helper method for selecting a single random string from an ArrayList of
     * strings.
     * 
     * @param wordList - ArrayList of strings
     * @return a randomly selected string
     */
    private String randomWord(ArrayList<String> wordList)
    {
        // UNFINISHED
        return "";
    }
    
    
    // ALL OF THE METHODS BELOW THIS POINT SHOULD BE ONE-LINERS. 

    /**
     * @return A randomly selected noun
     */
    public String randomNoun()
    {
        // UNFINISHED
        return "";
    }

    /**
     * @return A randomly selected verb
     */
    public String randomVerb()
    {
        // UNFINISHED
        return "";
    }

    /**
     * @return A randomly selected adjective
     */
    public String randomAdjective()
    {
        // UNFINISHED
        return "";
    }

    /**
     * @return a randomly selected adverb
     */
    public String randomAdverb()
    {
        // UNFINISHED
        return "";
    }

    /**
     * Check a word to see if it is a noun.
     * 
     * @param word - the word to check
     * @return - true if it is a noun
     */
    public boolean isNoun(String word)
    {
        // UNFINISHED
        return false;
    }

    /**
     * Check a word to see if it is a verb.
     * 
     * @param word - the word to check
     * @return - true if it is a verb
     */
    public boolean isVerb(String word)
    {
        // UNFINISHED
        return false;
    }

    /**
     * Check a word to see if it is a adjective.
     * 
     * @param word - the word to check
     * @return - true if it is a adjective
     */
    public boolean isAdjective(String word)
    {
        // UNFINISHED
        return false;
    }

    /**
     * Check a word to see if it is a adverb.
     * 
     * @param word - the word to check
     * @return - true if it is a adverb
     */
    public boolean isAdverb(String word)
    {        
        // UNFINISHED
        return false;
    }
}
