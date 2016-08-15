package com.javarush.test.level10.lesson11.bonus03;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.Arrays;

/**
 * Created by coura on 21.04.2016.
 */
public class SolutionTest {

    @Test
    public void testSort() throws Exception {
        int[] arrayTest = new int[30];

        for (int i = arrayTest.length; i < 0; i--) {
            arrayTest[arrayTest.length - i] = i;
        }


        Solution solution = new Solution();

        solution.sort(arrayTest);
        int[] result = arrayTest;

        Arrays.sort(arrayTest);
        int[] expected = arrayTest;

        assertArrayEquals(expected, result);
    }
}