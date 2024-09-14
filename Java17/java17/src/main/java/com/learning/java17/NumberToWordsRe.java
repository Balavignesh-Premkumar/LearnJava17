package com.learning.java17;

public class NumberToWordsRe {
 
    public static int getDigitCount(int number) {
        
        if (number < 0) {
            return -1;
        }
 
        if (number == 0) {
            return 1;
        }
 
        int count = 0;
        // start from 1 and multiply by 10 each step so i goes 1, 10, 100, 1000
        // count how many times it was multiplied, and that's the digit count
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }
 
    public static void numberToWords(int number) {
        
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
 

        if (number == 0) {
            System.out.println("Zero");
            return;
        }
 
        int minus_value = (int) Math.pow(10, (getDigitCount(number) - 1));
        int temp = number;
        while (minus_value != 0) {
            int digit2print = temp / minus_value;
            temp = temp % minus_value;
            minus_value = minus_value / 10;
            switch (digit2print) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            }
        }

    }

    public static void main(String[] args) {
        numberToWords(1000);
        System.out.println("\n");
        numberToWords(999);
        System.out.println("\n");
        numberToWords(9);
    }
}