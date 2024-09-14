package com.learning.java17; // Define the package for this class

public class NumberOfDaysInMonth { 
/** 
 * @param args
 */
// Start of the NumberOfDaysInMonth class

    // Main method: serves as the entry point for the program
    public static void main(String[] args) {

    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if year is outside the valid range
        if (year < 1 || year > 9999) {
            return false; // Return false if year is out of valid range
        } else {
            // Check if year is divisible by 4
            if (year % 4 == 0) {
                // Check if year is a century year
                if (year % 100 == 0) {
                    // Check if century year is divisible by 400
                    if (year % 400 == 0) {
                        return true; // Return true if all leap year conditions are met
                    } else {
                        return false; // Return false if century year is not divisible by 400
                    }
                } else {
                    return true; // Return true if year is divisible by 4 but not a century year
                }
            } else {
                return false; // Return false if year is not divisible by 4
            }
        }
    }

    // Method to get the number of days in a given month of a given year
    public static int getDaysInMonth(int month, int year) {
        // Check if month or year is outside the valid range
        if ((month <= 1 || month >= 12) && (year <= 1 || year >= 9999)) {
            return -1; // Return -1 if month or year is out of valid range
        }
        // Switch statement to determine the number of days based on the month
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31; // Return 31 for months with 31 days
            case 2 -> isLeapYear(year) ? 29 : 28; // Return 29 or 28 for February depending on leap year
            case 4, 6, 9, 11 -> 30; // Return 30 for months with 30 days
            default -> -1; // Return -1 for any other cases (invalid input)
        };
    }
}