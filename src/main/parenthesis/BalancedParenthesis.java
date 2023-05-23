package main.parenthesis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalancedParenthesis {

    /*
     * Balanced parenthesis: Given a string, determine if it is “balanced”, where “balanced” is
     * defined by having a matching closing parenthesis for each open parenthesis (in the
     * order in which it was opened). The set of all possible characters is: {“(“, ”{“, ”[“ ,“]”, ”}”,
     * “)”}.
     * a. Examples of balanced parenthesis:
     * i. “((({{{[[[]]]}}})))”
     * ii. “{{{[][][]}}}”
     * iii. “()(){{{}}}[][]”
     * iv. “()()()()”
     * b. Examples of unbalanced parenthesis:
     * i. “(((())})”
     * ii. “)((()))()()”
     * iii. “((()()()))(()”
     */


    public static boolean verifyBalancedParenthesis(String str) {
        String openParenthesis = "{([";
        String closeParenthesis = "}])";
        Map<Character, Character> mirrorParenthesis = new HashMap<>();
        mirrorParenthesis.put(']', '[');
        mirrorParenthesis.put('}', '{');
        mirrorParenthesis.put(')', '(');
        List<Character> parenthesisStack = new ArrayList<>();

        for (char letter : str.toCharArray()) {
            //is opening
            if (openParenthesis.indexOf(letter) != -1) {
                parenthesisStack.add(letter);
                // is closing
            } else if (closeParenthesis.indexOf(letter) != -1) {
                if (parenthesisStack.size() == 0) return false;
                if (parenthesisStack.remove(parenthesisStack.size() - 1) != mirrorParenthesis.get(letter)) return false;
            }
        }

        return parenthesisStack.size() == 0;
    }

}
