package Hashing;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class FreqOfElementsUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // use Map -- collection class to find frequency of elements
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            // if map doesn't contain that key - initilize it with 
            if(map.containsKey(arr[i]) == false){
            map.put(arr[i],1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        // print the elements and their frequencies
        System.out.println("Print elements and their corresponding frequencies");
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
         
    }
}
