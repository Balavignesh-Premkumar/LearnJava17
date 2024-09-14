public class SumOddRange {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); // Output: 2500
        
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int param1, int param2)
    {
        if (param1 < 1 || param2 < 1 || param2 < param1) {
            return -1;
        }
        int sum = 0;
        for (int i = param1; i <= param2; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
    
}
