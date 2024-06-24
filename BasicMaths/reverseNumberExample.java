// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes 
// the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// time-complexity - O(log10N + 1)
// space-complexity - O(1)

package BasicMaths;
import java.util.Scanner;

public class reverseNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int rev = reverseNumber(x);
        System.out.printf("%d", rev);

        sc.close();
    }

    public static int reverseNumber(int x){
        int num = x;
        long rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = rev*10 + digit;
            if(rev > Integer.MAX_VALUE) return 0;
            if(rev < Integer.MIN_VALUE) return 0;
            num = num/10;
        }
        return (int) rev;
    }
    
}
