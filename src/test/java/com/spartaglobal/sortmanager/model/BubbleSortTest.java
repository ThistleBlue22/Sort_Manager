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

    @Test
    @DisplayName("Given an array of numbers as if through user input, output the sorted array of integers")
    public void givenAnArrayOfNumberAsIfThroughUserInputOutputTheSortedArrayOfIntegers(){
        int[] baseArray = new int[10];

        baseArray[0] = 56;
        baseArray[1] = 12;
        baseArray[2] = 99;
        baseArray[3] = 46;
        baseArray[4] = 1;
        baseArray[5] = 99;
        baseArray[6] = 33;
        baseArray[7] = 67;
        baseArray[8] = 7;
        baseArray[9] = 6;

        int[] actual = bs.sort(baseArray.clone());
        int[] expected = sorterForTheTests(baseArray.clone());

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    @DisplayName("Zero numbers added randomly to the array. Only initialised")
    public void zeroNumbersAddedRandomlyToTheArrayOnlyInitialised(){
        int[] zeroNumbers = new int[10];

        int[] expected = sorterForTheTests(zeroNumbers);
        int[] actual = bs.sort(zeroNumbers);

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    @DisplayName("Given an array of only negative numbers return the negative numbers in the order they should appear in")
    public void givenAnArrayOfOnlyNegativeNumberReturnTheNegativeNumbersInTheOrderTheyShouldAppearIn(){
        int[] newArray = new int[10];
        newArray[0] = -100;
        newArray[1] = -1;
        newArray[2] = -16;
        newArray[3] = -150;
        newArray[4] = -1660;
        newArray[5] = -1312;
        newArray[6] = -42;
        newArray[7] = -555;
        newArray[8] = -11;
        newArray[9] = -10;

        int[] expected = sorterForTheTests(newArray.clone());
        int[] actual = bs.sort(newArray.clone());

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    @DisplayName("Given Positive and Negative values return them in the correct order")
    public void givenPositiveAndNegativeValuesReturnThemInTheCorrectOrder(){
        int[] newArray = new int[10];
        newArray[0] = 56;
        newArray[1] = 12;
        newArray[2] = 99;
        newArray[3] = 46;
        newArray[4] = 1;
        newArray[5] = -1312;
        newArray[6] = -42;
        newArray[7] = -555;
        newArray[8] = -11;
        newArray[9] = -10;

        int[] expected = sorterForTheTests(newArray.clone());
        int[] actual = bs.sort(newArray.clone());

        Assertions.assertArrayEquals(expected, actual);
    }
}