package Recursion;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Array Size:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i =0;i<n;i++){
            int v = sc.nextInt();
            array[i] = v;
        }

        // reverse array function using two pointer
        System.out.println("reverse array function using two pointer");
        reverseArrayUsingTwoPointers(0, n-1, array);
        for(int i =0;i<n;i++){
            System.out.printf("%d ", array[i]);
        }
        
        System.out.println("\n");
        int[] array1 = new int[n];
        for(int i =0;i<n;i++){
            int v = sc.nextInt();
            array1[i] = v;
        }
        System.out.println("\n");
        // reverse array function using single pointer
        System.out.println("reverse array function using one pointer");
        reverseArrayUsingOnePointers(0,n, array1);
        for(int i =0;i<n;i++){
            System.out.printf("%d ", array1[i]);
        }

        sc.close();

    }

    public static void swap(int[] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void reverseArrayUsingTwoPointers(int l, int r, int[] arr){
        if(l >= r){
            return;
        }
        swap(arr,l,r);
        reverseArrayUsingTwoPointers(l+1, r-1, arr);
    }

    public static void reverseArrayUsingOnePointers(int l,int n, int[] arr){
        if(l >= n/2){
            return;
        }
        swap(arr,l,n-l-1);
        reverseArrayUsingOnePointers(l+1, n, arr);
    }
}
