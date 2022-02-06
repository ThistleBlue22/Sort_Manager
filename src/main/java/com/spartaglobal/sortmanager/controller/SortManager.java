package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.SortFactoryMain;
import com.spartaglobal.sortmanager.model.*;

import java.util.Arrays;
import java.util.Random;

public class SortManager {

    public int[] initiateSorting(int desiredSortingMethod, int[] integerList){

        if (integerList.length == 0){
            System.out.println("The length of the array needs to have at least one number to function");
            return (integerList);
        }
        if (integerList[0] == 0){
            integerList = randomNumber(integerList);
        }

        Sort s = getSortType(desiredSortingMethod);
        SortFactoryMain.logger.debug("The unsolved array: " + Arrays.toString(integerList));
        return s.sort(integerList);
    }

    public Sort getSortType(int sortType){

        switch (sortType){
            case 1 -> SortFactoryMain.logger.debug("The chosen sorter is Bubble");
            case 2 -> SortFactoryMain.logger.debug("The chosen sorter is Merge");
            case 3 -> SortFactoryMain.logger.debug("The chosen sorter is Binary Search Tree");
        } // Depending on user input it outputs which Algorithm is chosen.

        SortFactory sf = switch (sortType){
            case 1 -> new BubbleSortFactory();
            case 2 -> new MergeSortFactory();
            case 3 -> new BinarySearchTreeFactory();
            default -> null;
        }; // Sets sf to a specific Sort Factory, null if no cases are met

        if (sf == null){
            // SortFactoryMain.logger.debug("Invalid option entered. Quitting..");
            System.out.println("The option you chose is unavailable. Please try again with a valid option. Quitting..");
            System.exit(0);
        } // if sf comes back as null the program, and displays the reason. Can change to a log message.

        return sf.getInstance();

    }

    public int[] randomNumber(int[] intArray){
        int range = intArray.length;

        Random random = new Random();

        for (int j = 0; j < range; j++){
            intArray[j] = random.nextInt(1000) + 1;
        }
        return intArray;
    }

}
