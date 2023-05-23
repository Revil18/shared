package main.anagram;

import java.util.HashMap;
import java.util.Map;

public class VerifyAnagram {

    /*
     * Given two strings, determine if these are anagrams of each other. Two strings are
     * anagrams of each other, if, and only if, they contain all the same characters the same
     * amount of times.
     * a. Examples: heart and earth, cars and scar, star and rats
     * b. Additionally, the following test case MUST pass:
     * i. “Tom Marvolo Riddle” -> “I am Lord Voldemort”
     */

    public static boolean isAnagram(String strOne, String strTwo) {

        // if not same length return false


        //to lower case and rm special
        char[] one = strOne.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        char[] two = strTwo.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        if( one.length != two.length ) return false;

        Map<Character, Integer> numberOfChars = new HashMap<>();
        //map chars strOne
        for( Character letter : one) {
            numberOfChars.put(letter, numberOfChars.getOrDefault(letter , 0) + 1);
        }

        //if map contains remove chars else false
        for( Character letter : two) {
            if( !numberOfChars.containsKey(letter) || numberOfChars.get(letter) <= 0) return false;
            numberOfChars.put(letter, numberOfChars.getOrDefault(letter , 0) - 1);
        }
        return true;
    }

}
