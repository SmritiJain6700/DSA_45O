package Recursion;
import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        
        if(isPalindromeCheck(0,inputString.length(),inputString)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }

        sc.close();

    }

    public static boolean isPalindromeCheck(int i, int n, String inputString){
        if(i >= n/2){
            return true;
        }
        if(inputString.charAt(i) != inputString.charAt(n-i-1)){
            return false;
        }
        return isPalindromeCheck(i+1, n, inputString);
    }

}
