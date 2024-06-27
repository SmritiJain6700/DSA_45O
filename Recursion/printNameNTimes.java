package Recursion;

import java.util.Scanner;

public class printNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);
        sc.close();
    }
    public static void printName(int n){
        printHere(1,n);
    }
    public static void printHere(int i,int n){
        if(i > n){
            return;
        }
        System.out.print("GFG" + " ");
        printHere(i+1, n);
    }

}
