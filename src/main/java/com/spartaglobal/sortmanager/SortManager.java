package com.spartaglobal.sortmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SortManager {
    public static void main(String[] args) {

        SortManager sm = new SortManager();

        ArrayList<Integer> intArray = new ArrayList<>();

        Random random = new Random();
        //int range = random.nextInt(10);

        for (int j = 0; j < 10; j++){
            intArray.add(random.nextInt(100));
        }

        int[] intList = new int[intArray.size()];

        for (int i = 0; i < intArray.size(); i++){
            intList[i] = intArray.get(i);
        }

        System.out.println(intArray);
        System.out.println(sm.bubbleSort(intArray));
        System.out.println(Arrays.toString(sm.mergeSort(intList)));

    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> unorganisedArray) {
        int lengthOfList = unorganisedArray.size();

        while (lengthOfList > 1){

            for (int i = 0; i < lengthOfList-1; i++){
                if (unorganisedArray.get(i) > unorganisedArray.get(i+1)){
                    int swap = unorganisedArray.get(i);
                    unorganisedArray.set(i, unorganisedArray.get(i+1));
                    unorganisedArray.set(i+1, swap);
                }
            }

            lengthOfList -= 1;
        }

        return unorganisedArray;

    }

    public int[] mergeSort(int[] mergeSortList){
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

        mergeSort(arrayOne);
        mergeSort(arrayTwo);

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
    // Impossible without the help of this video https://www.youtube.com/watch?v=bOk35XmHPKs
    // Somehow got the right merge but messed up the split to begin with

}
