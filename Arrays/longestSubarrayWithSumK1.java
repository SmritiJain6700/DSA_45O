//this is optimal solution for array having positive integer and zeroes
// time-complexity= O(2n)
// space-complexity = O(1)
package Arrays;

public class longestSubarrayWithSumK1{
    public static void main(String[] args) {
        int[] arr = {6, 8, 14, 9, 4, 11, 10};
        int k = 13;

        //using two pointer we can solve
        int n = arr.length;
        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxLen = 0;

        while(right < n){
            while(sum > k){
                sum -= arr[left];
                left += 1;
            }
            right += 1;
            if(right < n) sum += arr[right];
            if(sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
        }

        System.out.println("Longest subarray array having sum k is:");
        System.out.println(maxLen+"");

    }
}