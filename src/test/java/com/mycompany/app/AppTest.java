package com.mycompany.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import com.mycompany.app.*;

/**
 * Unit tests for App.
 */
public class AppTest {


    @Test
    public void testExecuteCounterOnCreditSuisseInput() {
        /***
         * Testing counter on Credit-Suisse input given
         */
        char input[] = App.CS_INPUT;
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 5);
        expected.put('d', 1);
        expected.put('h', 3);
        expected.put('p', 1);
        Stream<Character> inputStream = new String(input).chars().mapToObj(i->(char)i);
        Map<Character, Integer> received = App.Count(inputStream);
        // Check the length and the content of expected and received maps is same
        Assert.assertEquals(expected, received);
    }

    @Test
    public void testExecuteCounterOnLongInput() {
        /***
         * Testing counter on long input
         */
        int inputLength = 10000;
        Stream<Character> randomCharArrayStreamOfLen10000 = App.GetRandomCharArray(inputLength);
        Map<Character, Integer> received = App.Count(randomCharArrayStreamOfLen10000);
        // Sum all character occurrences
        Integer sumOfAllOccurrences = received.values().stream().mapToInt(Integer::valueOf).sum();
        // Check that the length of the input char array and the sum of all occurrencies are same
        Assert.assertEquals(inputLength, sumOfAllOccurrences.intValue());
    }

    @Test
    public void testExecuteCounterOnZeroLengthInput() {
        /***
         * Testing counter on zero-length input
         */
        int inputLength = 0;
        Stream<Character> randomCharArrayStreamOf0 = App.GetRandomCharArray(inputLength);
        Map<Character, Integer> received = App.Count(randomCharArrayStreamOf0);
        // Sum all character occurrences
        Integer sumOfAllOccurrences = received.values().stream().mapToInt(Integer::valueOf).sum();
        // Check that the sum of all occurrences is 0
        Assert.assertEquals(inputLength, sumOfAllOccurrences.intValue());
    }

    @Test
    public void testExecuteCounterOnNullInput() {
        /***
         * Testing counter on null input
         */
        Stream<Character> nullCharArrayInput = null;
        Map<Character, Integer> received = App.Count(nullCharArrayInput);
        // Sum all character occurences
        Integer sumOfAllOccurrences = received.values().stream().mapToInt(Integer::valueOf).sum();
        // Check that the sum of all occurrences is 0
        Assert.assertEquals(0, sumOfAllOccurrences.intValue());
    }
}
