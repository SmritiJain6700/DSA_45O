// time complexity - O(n**2) in avg and worst case and O(n) in best case (array is already sorted )
// space complexity - O(1) -- inplace - no extra space
// stable as the relative order is maintained.

package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,6,5,7};
        System.out.println("Call selection sort");
        int[] ans = bubbleSorting(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+"");
        }
    }
    
    
    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
 
    public static int[] bubbleSorting(int[] arr){
            int n = arr.length;
            for(int i=0;i<n-1;i++){
                boolean swapped = false;
                for(int j=0;j<n-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        // if elements are not in correct order swap them
                        swap(arr,j,j+1);
                        swapped = true;
                    }
                }
                // it means for one entire  iteration there was no element to swap = sorted array
                if(swapped == false){
                    break;
                }
            }
            return arr;
    }
}
