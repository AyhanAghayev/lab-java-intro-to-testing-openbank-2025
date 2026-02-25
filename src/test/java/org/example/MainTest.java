package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void returnOddsFromOneToN_whenMinus_throwsException() {
       Exception exception = assertThrows(IllegalArgumentException.class, () -> Main.returnOddsFromOneToN(-1));

       assertEquals("Input can not be minus!", exception.getMessage());
    }

    @Test
    public void returnOddsFromOneToN_validInput_returnsValidList() {
        List<Integer> result;

        result = Main.returnOddsFromOneToN(100);

        for (int i : result) {
            assertNotEquals(0, i%2);
        }

        assertTrue(result.getLast() - 1 <= 100);
    }

    @Test
    void shouldReturnTrue_whenSingleKeyword() {
        assertTrue(Main.hasKeywords("for"));
    }

    @Test
    void shouldReturnTrue_whenKeywordInsideSentence() {
        assertTrue(Main.hasKeywords("this is a public class"));
    }

    @Test
    void shouldReturnFalse_whenNoKeywordsPresent() {
        assertFalse(Main.hasKeywords("hello world example"));
    }

    @Test
    void shouldReturnTrue_whenMultipleKeywordsPresent() {
        assertTrue(Main.hasKeywords("public static void"));
    }

    @Test
    void shouldIgnoreLeadingAndTrailingSpaces() {
        assertTrue(Main.hasKeywords("   return   "));
    }

    @Test
    void shouldReturnFalse_whenEmptyString() {
        assertFalse(Main.hasKeywords(""));
    }

    @Test
    void shouldReturnFalse_whenOnlySpaces() {
        assertFalse(Main.hasKeywords("     "));
    }

    @Test
    void shouldBeCaseSensitive() {
        assertFalse(Main.hasKeywords("Public"));
        assertTrue(Main.hasKeywords("public"));
    }

    @Test
    void shouldNotMatchPartialWords() {
        assertFalse(Main.hasKeywords("classification"));
        assertFalse(Main.hasKeywords("foreach"));
    }


}