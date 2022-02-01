package com.spartaglobal.sortmanager.view;

import java.util.Arrays;
import java.util.Scanner;

public class SortView {
    public String getDesiredSort(){
        System.out.print("Please enter your desired Sorting Algorithm. The available Algorithms are currently Bubble and Merge: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public void displayResults(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }
}
