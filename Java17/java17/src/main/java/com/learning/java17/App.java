package com.learning.java17;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double x = 20d;
        double y = 80d;
     
        System.out.println("isRemainderZero: " + isRemainderZero(x,y));

    }

    
    /** 
     * @param x
     * @param y
     * @return boolean
     */
    public static boolean isRemainderZero(double x, double y) {
        double z = (x + y) * 100.00;
        double remainder = z % 40.00;
        return (remainder == 0) ? true : false;
    }
}
