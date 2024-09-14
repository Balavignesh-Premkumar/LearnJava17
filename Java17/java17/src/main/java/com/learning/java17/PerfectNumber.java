package com.learning.java17;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); // true
    }

    public static boolean isPerfectNumber (int param)
    {
        if(param<1)
        {
            return false;
        }
        int sum=0;
        for(int i=1;i<param;i++)
        {
            if(param%i==0)
            {
                sum+=i;
            }
        }
        return sum==param;
    }
    
}
