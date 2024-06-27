// Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

// Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
package Recursion;

import java.util.Scanner;

public class factorilaOfN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = factorial(num);
        System.out.printf("%d",factorial);
        sc.close();
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
