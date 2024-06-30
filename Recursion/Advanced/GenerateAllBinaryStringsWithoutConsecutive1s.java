//time-complexity = O()
package Recursion.Advanced;

import java.util.ArrayList;
public class GenerateAllBinaryStringsWithoutConsecutive1s {
    public static void generateAllBinaryStrings(int k, String output, ArrayList<String> ans){
        if(output.length() == k){
            ans.add(output);
            return;
        }
        if(output.charAt(output.length()-1) == '1'){
            generateAllBinaryStrings(k, output + '0', ans);
        }
        else{
            generateAllBinaryStrings(k, output + '0', ans);
            generateAllBinaryStrings(k, output + '1', ans);
        }


    }
    public static void main(String[] args) {
        int k = 4;
        ArrayList<String> ans  = new ArrayList<>();
        generateAllBinaryStrings(k,"0",ans);
        generateAllBinaryStrings(k,"1",ans);
        System.out.println("All binary string without consequetive ones:");
        for(String s : ans){
            System.out.println(s + "");
        }

    }
}
