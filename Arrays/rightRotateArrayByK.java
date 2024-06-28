package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
public class rightRotateArrayByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,1,2,7,5,6};
        int n = arr.length;
        
        // enter the value of k
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        rightrotateArrayByK(arr, k, n);
        System.out.println("Print the elements of array after rotating it to left by K elements");
        for(int i:arr){
            System.out.println(i+"");
        }
        int[] arr2 = {3,4,1,2,7,5,6,0,-1}; 
        int n2 = arr2.length;
        rotateArray(arr2, k, n2);
        System.out.println("Print the elements of array after rotating it to left by K elements");
        for(int i:arr2){
            System.out.println(i+"");
        }
        sc.close();

    }
    // brute force
    public static void rightrotateArrayByK(int[] arr, int k, int n){
        // time complexity = O(n)
        // space complexity  = O(k)
        if(n == 0) return;
        k = k%n;
        if(k == 0) return;

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=n-k;i<n;i++){
            temp.add(arr[i]);
        }
        for(int j = n-k-1;j>=0;j--){
            arr[j+k] = arr[j];
        }

        for(int i = 0; i<k;i++){
            arr[i] = temp.get(i);
        }

        return;
    }

    public static void reverse(int[] arr, int low, int high){
        int l = low;
        int r = high;
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l += 1;
            r -= 1;
        }
    }
    // reverse the elements 0 to n-k-1 and n-k to n-1 and 0 to n-1
    public static void rotateArray(int[] arr, int k, int n){
        if(n == 0) return;
        k = k%n;
        if(k == 0) return;
        // Reverse first n-k elements
        reverse(arr, 0, n-k-1);

        // Reverse last k elements
        reverse(arr, n-k, n-1);

        // Reverse all elements
        reverse(arr,0,n-1);
    }
}
