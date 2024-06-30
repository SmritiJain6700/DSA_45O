// For Input: 
// 17 15
// -13 0 6 15 16 2 15 -12 17 -16 0 -3 19 -3 2 -9 -6
// It's Correct output is: 
// 5
//this is optimal solution for array having positive integer and zeroes and negative integers
// time complexity - O(n) -- if HashMap(unordered) is used O(nlogn) - if treeMap(ordered or sorted)
// pace-complexity = O(n)
package Arrays;

import java.util.HashMap;
public class longestSubarrayWithhSumK2{
    public static void main(String[] args) {
        int[] arr = {-13,0,6,15,16,2,15,-12,17,-16,0,-3,19,-3,2,-9,-6};
        int k = 15;
        int n = arr.length;
        // find largest subarray with sum k
        long prefSum = 0;
        HashMap<Long,Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int i=0;i<n;i++){
            prefSum += arr[i];
            if(prefSum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            long remSum = prefSum - k;
            if(map.containsKey(remSum)){
                maxLen = Math.max(maxLen, i-map.get(remSum));
            }
            if(map.containsKey(prefSum) == false){
                map.put(prefSum, i);
            }

        }
        System.out.println("Longest length of subarray with sum as k");
        System.out.println(maxLen+"");

    }
}