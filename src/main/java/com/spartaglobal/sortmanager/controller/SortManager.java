package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.BubbleSortFactory;
import com.spartaglobal.sortmanager.model.MergeSortFactory;
import com.spartaglobal.sortmanager.model.Sort;
import com.spartaglobal.sortmanager.model.SortFactory;


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
        return s.sort(integerList);
    }

    public Sort getSortType(String sortType){


        SortFactory sf = switch (sortType.toLowerCase()){
            case "bubble" -> new BubbleSortFactory();
            case "merge" -> new MergeSortFactory();
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
