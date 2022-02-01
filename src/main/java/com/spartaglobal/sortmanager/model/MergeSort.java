package com.spartaglobal.sortmanager.model;

public class MergeSort implements Sort{
    public int[] sort(int[] mergeSortList){

            if (mergeSortList.length == 1){
                return mergeSortList;
            }

            int lengthOfList = mergeSortList.length;

            int midIndex = lengthOfList/2;
            int[] arrayOne = new int[lengthOfList/2];
            int[] arrayTwo = new int[lengthOfList - midIndex];

            for (int i = 0; i < midIndex; i++){
                arrayOne[i] = mergeSortList[i];
            }
            for (int i = midIndex; i < lengthOfList; i++){
                arrayTwo[i - midIndex] = mergeSortList[i];
            }

            sort(arrayOne);
            sort(arrayTwo);

            return (merge(mergeSortList, arrayOne, arrayTwo));


        }

        private static int[] merge(int[] inputArray, int[] arrayOne, int[] arrayTwo){
            int arrayOneSize = arrayOne.length;
            int arrayTwoSize = arrayTwo.length;

            int i = 0, j = 0, k = 0;

            while (i < arrayOneSize && j < arrayTwoSize){
                if (arrayOne[i] <= arrayTwo[j]){
                    inputArray[k] = arrayOne[i];
                    i++;
                }
                else{
                    inputArray[k] = arrayTwo[j];
                    j++;
                }
                k++;
            }

            while (i < arrayOneSize){
                inputArray[k] = arrayOne[i];
                i++;
                k++;
            }

            while (j < arrayTwoSize){
                inputArray[k] = arrayTwo[j];
                j++;
                k++;
            }

            return inputArray;

    }
}
