public class NumberPalindrome {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10)); // Output: false
        System.out.println(isPalindrome(0)); // Output: true
    }

    
    /** 
     * @param number
     * @return boolean
     */
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
