package com.spartaglobal.sortmanager.model;

import com.spartaglobal.sortmanager.controller.SortManager;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BubbleSortTest {

    private BubbleSort bs;
    private SortManager sm;
    @BeforeEach
    public void objectSet() {
        bs = new BubbleSort();
        sm = new SortManager();
    }

    private int[] sorterForTheTests(int[] unsorted){

        List<Integer> listOfInts = new ArrayList<>();
        for (int i = 0; i < unsorted.length; i++){
            listOfInts.add(i, unsorted[i]);
        }

        Collections.sort(listOfInts);

        int[] sorted = new int[listOfInts.size()];

        for (int i = 0; i < listOfInts.size(); i++){
            sorted[i] = listOfInts.get(i);
        }

        return sorted;

    }

    @Test
    @DisplayName("Given an array of 10 pseudo-random numbers, return a sorted array of the same Integers")
    public void givenAndArrayOf10PseudoRandomNumbersReturnASSortedArrayOfTheSameIntegers() {
        int[] array = new int[10];
        array = sm.randomNumber(array);
        int[] cloneArray = array.clone();
        int[] expected = sorterForTheTests(cloneArray);
        int[] actual = bs.sort(array);
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    @DisplayName("Given an array of 100000 pseudo-random numbers, return a sorted array of the same Integers")
    public void givenAndArrayOf100000PseudoRandomNumbersReturnASSortedArrayOfTheSameIntegers() {
        int[] array = new int[100000];
        array = sm.randomNumber(array);
        int[] cloneArray = array.clone();
        int[] expected = sorterForTheTests(cloneArray);
        int[] actual = bs.sort(array);
        Assertions.assertArrayEquals(expected, actual);

    }

}