package test.parenthesis;

import main.parenthesis.BalancedParenthesis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesisTest {

    @Test
    void verifyBalancedParenthesisTrue() {
        assertTrue(BalancedParenthesis.verifyBalancedParenthesis("((({{{[[[]]]}}})))"));
        assertTrue(BalancedParenthesis.verifyBalancedParenthesis("{{{[][][]}}}"));
        assertTrue(BalancedParenthesis.verifyBalancedParenthesis("()(){{{}}}[][]"));
        assertTrue(BalancedParenthesis.verifyBalancedParenthesis("()()()()"));
    }

    @Test
    void verifyBalancedParenthesisFalse() {
        assertFalse(BalancedParenthesis.verifyBalancedParenthesis("(((())})"));
        assertFalse(BalancedParenthesis.verifyBalancedParenthesis(")((()))()()"));
        assertFalse(BalancedParenthesis.verifyBalancedParenthesis("((()()()))(()"));
    }
}