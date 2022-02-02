package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.view.SortView;

import java.util.Random;

public class SortFactoryMain {
    public static void main(String[] args) {
        SortView sv = new SortView();
        String desiredSortType = sv.getDesiredSort();
        SortManager sm = new SortManager();
        Random random = new Random();
        int[] newIntList = new int[1];
        int[] result = sm.initiateSorting(desiredSortType, newIntList);
        sv.displayResults(result);
    }
}
