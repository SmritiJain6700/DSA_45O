// time complexity - O(n**2) in avg and worst case and O(n) in best case (array is already sorted )
// space complexity - O(1) -- inplace - no extra space
// stable as the relative order is maintained.

package Sorting;

public class insertionSortAlgo {
    public static void main(String[] args) {
        int[] arr = {4,7,6,1,2,9};

        insertionSort(arr);
        System.out.println("Printing the elements after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void swap(int[] arr, int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j]>key){
                swap(arr,j,j+1);
                j -= 1;
            }
            arr[j+1] = key;
        }
    }
}
