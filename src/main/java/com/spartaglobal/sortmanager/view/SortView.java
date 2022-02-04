package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.SortFactoryMain;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortView {
    public int getDesiredSort(){
        System.out.println("Please select your desired Sorting Algorithm (Please choose one at a time)");
        System.out.println("1. Bubble");
        System.out.println("2. Merge");
        System.out.println("3. Binary Search Tree");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getDesiredArraySize(){
        int number = 0;
        Random random = new Random();
        System.out.print("Would you like to supply an array length? Yes/No --> ");
        Scanner scanner = new Scanner(System.in);
        if ("yes".equals(scanner.next().toLowerCase())) {
            System.out.print("Please supply a non-negative, non-zero number --> ");
            try {
                number = Integer.parseInt(scanner.next());

            }
            catch (NumberFormatException e){
                e.printStackTrace();
                System.err.println("That was an incorrect number, please provide a full integer with no decimal place and no letters!".toUpperCase());
                System.exit(0);
            }



        } else {
            number = random.nextInt(100);
        }
        return number;
    }

    public void displayResults(int[] intArray, long oldTime){
        long currentTime = System.nanoTime();

        long timeToCompletion = currentTime-oldTime;
        SortFactoryMain.logger.debug("The solved array: " + Arrays.toString(intArray));
        SortFactoryMain.logger.debug("The sort took " + timeToCompletion + " total nanoseconds");
        System.out.println("The solved array: " + Arrays.toString(intArray));
        System.out.println("Would you like to run the program again?");
        Scanner scanner = new Scanner(System.in);
        String continueExecution = scanner.next();
        String[] args = new String[0];
        boolean doRepeat = false;
        do {
            if ("yes".equalsIgnoreCase(continueExecution)){
                doRepeat = true;
                SortFactoryMain.main(args);
            }
            else{
                SortFactoryMain.logger.debug("Exiting. . .");
                System.exit(0);
            }
        }while (doRepeat);
    }
}
