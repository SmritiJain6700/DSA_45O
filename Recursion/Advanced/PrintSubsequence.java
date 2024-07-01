package Recursion.Advanced;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequence {
    public static void generate(String s, int i, String op, List<String> ans){
        if(i == s.length()){
            ans.add(op);
            return;
        }
        generate(s, i+1, op+s.charAt(i), ans);
        generate(s, i+1, op, ans);
    }
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String s = "abc";
        generate(s,0,"",ans);
        for(String str:ans){
            System.out.println(str+"");
        }
        
    }
}
