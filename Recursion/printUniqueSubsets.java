//time-complexity = O(2**n . nlogn) -- each char will have two recursive calls then 2**n and n logn is for the sorting
//space-complexiy = O(2**n . n) -- 2**n will be generated and stored in an HashMap
package Recursion;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class printUniqueSubsets {
    
public static void generateDistinctSubsets(String str, int i, List<Character> op, Set<List<Character>> ans){
    if (str.length() == i) {
        List<Character> op3 = new ArrayList<>(op);
        Collections.sort(op3);
        ans.add(op3);
        return;
    }

    List<Character> op1 = new ArrayList<>(op);
    List<Character> op2 = new ArrayList<>(op);
    op2.add(str.charAt(i));
    generateDistinctSubsets(str, i + 1, op1, ans);
    generateDistinctSubsets(str, i + 1, op2, ans);
}

public static void main(String[] args) {
    String str1 = "gfg";
    String str2 = "ggg";
    Set<List<Character>> ans1 = new HashSet<>();
    Set<List<Character>> ans2 = new HashSet<>();
    List<Character> op = new ArrayList<>();

    generateDistinctSubsets(str1, 0, op, ans1);
    generateDistinctSubsets(str2, 0, op, ans2);

    System.out.println("print subsets of string 1" + str1);
    for(List<Character> c: ans1){
        System.out.print(c);
    }

    System.out.println("\nprint subsets of string 2" + str2);
    for(List<Character> c: ans2){
        System.out.print(c);
    }
}

}