package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.model.NegativeInputException;
import com.spartaglobal.sortmanager.view.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class SortFactoryMain {

    public static Logger logger = LogManager.getLogger(SortFactoryMain.class.getName());

    public static void main(String[] args) {


        SortView sv = new SortView();
        String desiredSortType = sv.getDesiredSort();
        SortManager sm = new SortManager();
        try{
            int[] newIntList = new int[sv.getDesiredArraySize()];
            long currentTime = System.nanoTime();
            int[] result = sm.initiateSorting(desiredSortType, newIntList);
            sv.displayResults(result, currentTime);
        }
        catch (NegativeArraySizeException e){
            throw new NegativeInputException("NUMBERS CANNOT BE NEGATIVE", e);
        }

    }
}
