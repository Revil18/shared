package test.anagram;

import main.anagram.VerifyAnagram;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *    * a. Examples: heart and earth, cars and scar, star and rats
 *      * b. Additionally, the following test case MUST pass:
 *      * i. “Tom Marvolo Riddle” -&gt; “I am Lord Voldemort”
 */
public class VerifyAnagramTest {

    @Test
    public void isAnagramTrue() {

        assertTrue(VerifyAnagram.isAnagram("heart", "earth"));
        assertTrue(VerifyAnagram.isAnagram("cars", "scar"));
        assertTrue(VerifyAnagram.isAnagram("star", "rats"));
        assertTrue(VerifyAnagram.isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort"));
    }

    @Test
    public void isAnagramFalse() {

        assertFalse(VerifyAnagram.isAnagram("heart", "a"));
        assertFalse(VerifyAnagram.isAnagram("cars", "scary"));
        assertFalse(VerifyAnagram.isAnagram("star", "abda"));
    }

    @Test
    public void isAnagramTrueComplex() {

        assertTrue(VerifyAnagram.isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort"));
    }

}