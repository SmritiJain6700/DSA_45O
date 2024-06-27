package Hashing;
import java.util.Scanner;

public class FreqOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int length = s.length();
        // creating frequency array and populating it
        int[] freqArray = new int[26];
        for(int i =0;i<length;i++){
            freqArray[s.charAt(i)-'a'] += 1;
        }
        System.out.println("Enter char for which freq to check");
        String c = sc.nextLine();
        System.out.println("Print the frequency of elements");
        System.out.printf("%d",freqArray[c.charAt(0)-'a']);
        sc.close();
    }
    
}
