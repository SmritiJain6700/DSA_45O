// Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

// Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
package Recursion;

import java.util.Scanner;

public class sumofNParameterised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfN(num,0);
        sc.close();
    }
    public static void sumOfN(int i, int sum){
        if(i < 1){
            System.out.print(sum);
            return;
        }
        sumOfN(i-1, sum+i);

    }
}
