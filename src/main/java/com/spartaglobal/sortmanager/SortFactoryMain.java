package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.model.NegativeInputException;
import com.spartaglobal.sortmanager.view.SortView;



public class SortFactoryMain {

    

    public static void main(String[] args) {
        SortView sv = new SortView();
        String desiredSortType = sv.getDesiredSort();
        SortManager sm = new SortManager();
        try{
            int[] newIntList = new int[sv.getDesiredArraySize()];
            int[] result = sm.initiateSorting(desiredSortType, newIntList);
            sv.displayResults(result);
        }
        catch (NegativeArraySizeException e){
            throw new NegativeInputException("NUMBERS CANNOT BE NEGATIVE", e);
        }

    }
}
