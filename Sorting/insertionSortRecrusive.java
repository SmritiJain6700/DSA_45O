// time-complexity - O(n**2)
// spece-complexity - O(1)
package Sorting;

public class insertionSortRecrusive {
    static void insertion_sort(int[] arr, int i, int size) {
        if (i == size) return;

        int j = i-1;
        int key = arr[i];
        while(j >= 0 && arr[j] > key){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            j = j-1;
        }
        arr[j+1] = key;
        insertion_sort(arr,i + 1, size);
    }

    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9,0,88,56,77,11,4,3};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, 0, n);

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

