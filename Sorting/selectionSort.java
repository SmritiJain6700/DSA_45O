// time complexity - O(n**2) in best, avg and worst case
// space complexity - O(1) -- inplace - no extra space
// not stable as the relative order is not maintained.

package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,6,5,7};
        System.out.println("Call selection sort");
        int[] ans = selectionSorting(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+"");
        }
    }

    public static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static int[] selectionSorting(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i; j<n;j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,i,min_index);
        }
        return arr;
    }
}
