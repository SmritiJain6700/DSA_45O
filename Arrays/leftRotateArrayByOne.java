// time-complexity - O(n)
// space-complexity - O(1)
package Arrays;

public class leftRotateArrayByOne{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,8};
        // rotate array by one 
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1;i < n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        // print the array after rotating it to the left by one 3,4,5,1,8,2
        System.out.println("Print array after rotating");
        for(int a:arr){
            System.out.println(a+"");
        }

    }
}