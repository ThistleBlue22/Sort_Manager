package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.view.SortView;

public class SortFactoryMain {
    public static void main(String[] args) {
        SortView sv = new SortView();
        String desiredSortType = sv.getDesiredSort();
        SortManager sm = new SortManager();
        int[] result = sm.initiateSorting(desiredSortType);
        sv.displayResults(result);
    }
}
