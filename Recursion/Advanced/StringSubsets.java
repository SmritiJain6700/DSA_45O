// at each index you have two choices to either take it or not
// time complexity - O(2**n)
//space-complexity - O(n) -- recursive stack space
package Recursion.Advanced;

import java.util.ArrayList;
import java.util.List;

public class StringSubsets {
    public static void subsets(String s, int i, String op, List<String> ans){
        if(s.length() == i){
            ans.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op2 += s.charAt(0);
        subsets(s, i+1, op1, ans);
        subsets(s, i+1, op2, ans);

    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> ans = new ArrayList<>();
        subsets(s,0," ",ans);
        System.out.println("Print all the subsequences:");
        for(String str: ans){
            System.out.println(str);
        }
    }
}
