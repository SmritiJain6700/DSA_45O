// time-complexity - O(n**2)
// spece-complexity - O(1)
package Sorting;

public class bubbleSortRecursion {
    static void bubble_sort(int[] arr, int n, int size) {
        // Base case: range == size.
        if (n == size-1) return;

        int didSwap = 0;
        for (int j = 0; j < size - n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }

        // If no swapping happens, array is already sorted.
        if (didSwap == 0) return;

        // Range increased after recursion:
        bubble_sort(arr, n + 1, size);
    }

    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9,0,88,56,77,11,4,3};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr, 0, n);

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
