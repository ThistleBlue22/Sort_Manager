package com.spartaglobal.sortmanager.facade;

import com.spartaglobal.sortmanager.controller.SortManager;
import com.spartaglobal.sortmanager.model.NegativeInputException;
import com.spartaglobal.sortmanager.view.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortFactoryMain {

    public static Logger logger = LogManager.getLogger("Sorting Project");

    public static void main(String[] args) {


        SortView sv = new SortView();
        int desiredSortType = sv.getDesiredSort();
        SortManager sm = new SortManager();
        try{
            int[] newIntList = new int[sv.getDesiredArraySize()];
            long currentTime = System.nanoTime();
            int[] result = sm.initiateSorting(desiredSortType, newIntList);
            sv.displayResults(result, currentTime);
        }
        catch (NegativeArraySizeException e){
            logger.error("The input data does not conform to the requirements of the program. Exiting..");
            throw new NegativeInputException("NUMBERS CANNOT BE NEGATIVE", e);
        }

    }
}
