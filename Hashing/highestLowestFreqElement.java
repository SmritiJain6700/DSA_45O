package Hashing;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(N), where N = size of the array. The insertion and retrieval operation in the map takes O(1) time.
// Space Complexity:  O(N), where N = size of the array. It is for the map we are using.
public class highestLowestFreqElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,4,4,2};

        Map<Integer,Integer> map = new HashMap<>();
        for(int val : arr){
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }
            else{
                map.put(val,0);
            }
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxFreqElement = 0;
        int minFreqElement = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(maxFreq < entry.getValue()){
                maxFreq = entry.getValue();
                maxFreqElement = entry.getKey();
            }
            if(minFreq > entry.getValue()){
                minFreq = entry.getValue();
                minFreqElement = entry.getKey();
            }
        }
        System.out.println("Maximun frequency element is "+maxFreqElement);
        System.out.println("Minimum Frequency element is " + minFreqElement);
    }
}
