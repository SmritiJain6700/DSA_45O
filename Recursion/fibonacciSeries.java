package Recursion;

import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fibonacci(n);
        System.out.printf("%d", ans);
        sc.close();
    }

    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
