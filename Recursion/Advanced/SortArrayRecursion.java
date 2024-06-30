//vimp
package Recursion.Advanced;

import java.util.ArrayList;

public class SortArrayRecursion {
    public static void sort(ArrayList<Integer> arr){
        if(arr.size() == 1) return;

        int temp = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,temp);
    }

    public static void insert(ArrayList<Integer> arr, int temp){
        if(arr.size()==0 || arr.get(arr.size()-1) <= temp){
            arr.add(temp);
            return;
        }
        int val = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr, temp);
        arr.add(val);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        // after sorting 
        sort(arr);
        for(int x:arr){
            System.out.println(x+"");
        }


    }
    
}
