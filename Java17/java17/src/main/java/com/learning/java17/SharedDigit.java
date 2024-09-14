package com.learning.java17;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        
    }

    public static boolean hasSharedDigit(int param1, int param2)
    {
        if((param1<10 || param1 >99) || (param2 < 10 || param2>99) )
        {
            return false;
        }
        else{
            int digit1=0,digit2=0;
            int digit3=0,digit4=0;
            int temp1=param1;
            int temp2=param2;
            digit2=temp1%10;
            digit1=temp1/10;
            digit4=temp2%10;
            digit3=temp2/10;
            boolean firstCompare=((digit1 == digit3) || (digit1 == digit4));
            boolean secondCompare=((digit2 == digit3) || (digit2 == digit4));
            return firstCompare || secondCompare;
        
        }
    }
    
}
