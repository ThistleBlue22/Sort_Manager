package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.model.NegativeInputException;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortView {
    public String getDesiredSort(){
        System.out.print("Please enter your desired Sorting Algorithm. The available Algorithms are currently Bubble and Merge --> ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
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
                System.out.println("(==============================================================)");
                System.err.println("That was an incorrect number, please provide a full integer with no decimal place and no letters!".toUpperCase());
                System.exit(0);
            }



        } else {
            number = random.nextInt(100);
        }
        return number;
    }

    public void displayResults(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }
}
