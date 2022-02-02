package com.spartaglobal.sortmanager.model;

public class BubbleSort implements Sort{
    public int[] sort(int[] unorganisedArray){
        int lengthOfList = unorganisedArray.length;

        while (lengthOfList > 1){

            for (int i = 0; i < lengthOfList-1; i++){
                if (unorganisedArray[i] > unorganisedArray[i+1]){
                    int swap = unorganisedArray[i];
                    unorganisedArray[i] = unorganisedArray[i+1];
                    unorganisedArray[i+1] = swap;
                }
            }

            lengthOfList -= 1;
        }

        return unorganisedArray;
    }
}
