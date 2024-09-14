package com.learning.java17;

public class RoughWork {

    public static void main(String[] args) {
        System.err.println("Hello");
        int no_of_digits = 4;
        int number = 1000;
        int minus_value = (int) Math.pow(10, (no_of_digits - 1));
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

}
