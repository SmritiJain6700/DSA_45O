package Hashing;

import java.util.Scanner;

public class FreqOfElements {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    //  input array
     System.out.println("Enter the size of the array");
     int n  = sc.nextInt();   
     int[] array = new int[n];
     for(int i=0;i<n;i++){
        int v = sc.nextInt();
        array[i] = v;
     }

    //  create frequence array -- size will be the maximum element which can be present in the array given in the prob
    int[] freqArray = new int[10001];
    for(int i = 0; i< n;i++){
        freqArray[array[i]] += 1;
    }

    // check if these number are present in the array or not and what is there freq
    System.out.println("Enter no of elements to check");
    int q = sc.nextInt();
    System.out.println("Enter elements to check");
    while(q != 0){
        int x = sc.nextInt();
        if(freqArray[x] > 0){
            System.out.println("Element is present in the array with freq " + freqArray[x]);
        }
        else{
            System.out.println("Element is not present in the array with freq " + freqArray[x]);
        }
        q-=1;
    }

    sc.close();

    }
}
