package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.SortFactoryMain;
import com.spartaglobal.sortmanager.model.*;


import java.util.Arrays;
import java.util.Random;

public class SortManager {

    public int[] initiateSorting(String desiredSortingMethod, int[] integerList){



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

    public Sort getSortType(String sortType){


        SortFactory sf = switch (sortType.toLowerCase()){
            case "bubble" -> new BubbleSortFactory();
            case "merge" -> new MergeSortFactory();
            case "bst" -> new BinarySearchTreeFactory();
            default -> new BubbleSortFactory();


        };

        return sf.getInstance();
    }

    public int[] randomNumber(int[] intArray){
        int range = intArray.length;

        Random random = new Random();

        for (int j = 0; j < range; j++){
            intArray[j] = random.nextInt(1000);
        }
        return intArray;
    }

}
