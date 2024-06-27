package Recursion;

import java.util.Scanner;

public class printt1toNUsingBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printt1toNBacktracking(n,n);
        sc.close();
    }
    public static void printt1toNBacktracking(int i,int num){
        if(i < 1){
            return;
        }

        printt1toNBacktracking(i-1, num);
        System.out.print(i+" ");
    }
}
