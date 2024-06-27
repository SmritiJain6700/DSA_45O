// time complexity - O(nlogn) in best, avg and worst case 
// space complexity - O(n) as temp array is used -- not inplace 
// stable as the relative order is maintained. -- During the merge step, when elements from the two subarrays are compared, if they are equal, 
// the element from the left subarray (which comes first in the original array) is copied 
// into the merged array first. This ensures that the relative order of equal elements is preserved.

package Sorting;

import java.util.ArrayList;
import java.util.List;

public class mergeSortAlgo {
    public static void main(String[] args){
        int[] arr = {5,1,2,6,3,4,7,9,10,8};

        mergeSort(arr, 0, arr.length-1);
        System.out.println("After sorting the elements");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low <= high) return;
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high); //these two will take O(log2n) of time
        merge(arr,low,mid,high); // take O(n)
    }

    public static void merge(int[] arr,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int l = low;
        int r = mid+1;
        while(l <= mid && r <= high){
            if(arr[l] <= arr[r]){
                temp.add(arr[l]);
                l += 1;
            }
            else{
                temp.add(arr[r]);
                r += 1;
            }
        }

        while(l <= mid){
            temp.add(arr[l]);
            l+=1;
        }

        while(r <= high){
            temp.add(arr[r]);
            r += 1;
        }

        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
    }
    
}
