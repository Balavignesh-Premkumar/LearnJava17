package com.learning.java17;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(23, 32, 42)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false
    }

    public static boolean hasSameLastDigit(int param1, int param2, int param3)
    {
        if((param1<10 || param1>1000) || (param2<10 || param2>1000) || (param3<10 || param3>1000))
        {
            return false;
        }
        else{
            int digit1=param1%10;
            int digit2=param2%10;
            int digit3=param3%10;
            return (digit1==digit2) || (digit1==digit3) || (digit2==digit3);
        }
    }
    
}
