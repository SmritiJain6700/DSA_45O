// For each character in the string, there are 2 recursive calls:
// One for keeping the character as it is.
// One for changing the character to uppercase.
// Therefore, for a string of length  n, there are 2**n recursive calls.
// Time Complexity: O(2n) 
// Auxiliary Space: O(n)
package Recursion;

import java.util.ArrayList;

public class PermutationWithCaseChange {
    public static void generate(String s,int i,String op, ArrayList<String> ans){
        if(s.length() == i){
            ans.add(op);
            return;
        }
        String op1 = op + s.charAt(i);
        String op2 = op + Character.toUpperCase(s.charAt(i));
        generate(s, i+1, op1, ans);
        generate(s, i+1, op2, ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = new ArrayList<>();
        generate(s, 0, "", ans);

        System.out.println("Print all permutations:");
        System.out.println("No of permutations:" + ans.size());
        for(String x : ans){
            System.out.println(x + "");
        }
    }
}
