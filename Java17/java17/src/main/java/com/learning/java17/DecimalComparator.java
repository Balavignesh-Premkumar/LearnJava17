package com.learning.java17;
import java.util.Scanner;

public class DecimalComparator {

    
    /** 
     * @param param1
     * @param param2
     * @return boolean
     */
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        param1 = param1 - (int) param1; // Remove the integer part of param1
        param2 = param2 - (int) param2; // Remove the integer part of param2

        int var1 = (int) (param1 * 1000); // Shift decimal three places for param1
        int var2 = (int) (param2 * 1000); // Shift decimal three places for param2

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        return var1 == var2; // Compare the integers

    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double param1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double param2 = scanner.nextDouble();

            boolean result = areEqualByThreeDecimalPlaces(param1, param2);
            System.err.println("Result: " + result);
        }
    }

}