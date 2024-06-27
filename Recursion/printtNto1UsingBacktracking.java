package Recursion;

import java.util.Scanner;

public class printtNto1UsingBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printtNto1Backtracking(1,n);
        sc.close();
    }
    public static void printtNto1Backtracking(int i,int num){
        if(i > num){
            return;
        }

        printtNto1Backtracking(i+1, num);
        System.out.print(i+" ");
    }
}
