package com.example.junittestproject;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysCompareTest {

    @Test
    public void ArraysSort_RandomArrayTest() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test()
    public void ArraysSort_NullArrayTest() {
        int[] numbers = null;
        int[] expected = {1, 3, 4, 12};

        assertThrows(NullPointerException.class, () -> {
            Arrays.sort(numbers);
        });
    }
    @Test
    public void ArraysPerformanceTest(){
        int [] numbers = {1,23,4,54};
        assertTimeout(Duration.ofMillis(20),()->{
            for (int i = 0; i < 1000000; i++) {
                numbers[0]=i;
                Arrays.sort(numbers);
            }

        });

    }
}
