// time complexity - O(nlogn) in best, avg and worst case 
// space complexity - O(1)  -- inplace 
// not stable as the relative order is maintained. 
package Sorting;

public class quickSortAlgo {
    public static void main(String[] args){
        int[] arr = {4,1,3,7,5,0};
        quickSort(arr, 0, arr.length-1);
        System.out.println("Printing element of the sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void swap(int[] arr, int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    } 

    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int partition_index = partition(arr, low, high);
            quickSort(arr, low, partition_index-1);
            quickSort(arr, partition_index+1,high);
        }

    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i <= j){
            while(i<=high && arr[i] <= pivot){
                i+=1;
            }
            while(j >= 0 && arr[j] > pivot){
                j -=1;
            }
            if(i < j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    
}
