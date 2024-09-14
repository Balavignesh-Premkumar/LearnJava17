package com.learning.java17;

import java.util.Scanner;

public class EnhancedSwitchChallenge {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the day of the week: ");
            int dayOfTheWeek = scanner.nextInt();
            String day= switch(dayOfTheWeek) {
               case 1 -> "Monday";
               case 2 -> "Tuesday";
               case 3 -> "Wednesday";
               case 4 -> "Thursday";
               case 5 -> "Friday"; 
               case 6 -> "Saturday";
               case 7 -> "Sunday";
               default -> "Invalid";
                
            };
            System.out.println("Day of the week is: " + dayOfTheWeek + " and the day is: " + day);
        }
    }
    
}
