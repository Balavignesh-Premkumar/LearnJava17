package com.learning.java17;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); // Output: 20
        System.out.println(getEvenDigitSum(252)); // Output: 4
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number)
    {
        if(number<0)
        {
            return -1;
        }
        int sum = 0;
        int digit=0;
        for (int i = number; i > 0; i /= 10) {
            digit = i % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        return sum;
    }
    
}
