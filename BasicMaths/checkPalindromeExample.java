// Given an integer x, return true if x is a palindrome, and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

// time complexity = O(log10N+1)
// space complexity = O(1)
package BasicMaths;

import java.util.Scanner;

public class checkPalindromeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isPalindrome = checkifPalindrome(x);
        if(isPalindrome){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }

        sc.close();
    }

    public static boolean checkifPalindrome(int x){
        int num = x;
        int rev = 0;
        if(num < 0){
            return false;
        }
        else{
            while(num != 0){
                int digit  = num%10;
                rev = rev*10+digit;
                num = num/10;
            }
            if(rev == x){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
