package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.BubbleSortFactory;
import com.spartaglobal.sortmanager.model.MergeSortFactory;
import com.spartaglobal.sortmanager.model.Sort;
import com.spartaglobal.sortmanager.model.SortFactory;


import java.util.Random;

public class SortManager {

    public int[] initiateSorting(String desiredSortingMethod){

        Random random = new Random();
        int range = random.nextInt(100);

        int[] intArray = new int[range];

        for (int j = 0; j < range; j++){
            intArray[j] = random.nextInt(1000);
        }

        Sort s = getSortType(desiredSortingMethod);
        return s.sort(intArray);
    }

    public Sort getSortType(String sortType){
        SortFactory sf = switch (sortType.toLowerCase()){
            case "bubble" -> new BubbleSortFactory();
            case "merge" -> new MergeSortFactory();
            default -> new BubbleSortFactory();
        };

        return sf.getInstance();
    }

}
