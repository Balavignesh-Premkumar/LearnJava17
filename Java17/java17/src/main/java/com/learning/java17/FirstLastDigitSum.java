package com.learning.java17;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("Sum of first and last digit of 252 is: " + sumFirstAndLastDigit(252));
        System.out.println("Sum of first and last digit of 257 is: " + sumFirstAndLastDigit(257));
        System.out.println("Sum of first and last digit of 0 is: " + sumFirstAndLastDigit(0));
        System.out.println("Sum of first and last digit of 5 is: " + sumFirstAndLastDigit(5));
        System.out.println("Sum of first and last digit of -10 is: " + sumFirstAndLastDigit(-10));
    }

    
    /** 
     * @param number
     * @return int
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }

        return firstDigit + lastDigit;
    }
    
}
