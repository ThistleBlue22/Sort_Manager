package com.spartaglobal.sortmanager.model;

import com.spartaglobal.sortmanager.controller.SortManager;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    private MergeSort ms;
    private SortManager sm;
    @BeforeEach
    public void objectSet() {
        ms = new MergeSort();
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

}