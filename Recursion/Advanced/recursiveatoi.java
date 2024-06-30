// to convert a string to integer
package Recursion.Advanced;
import java.util.Scanner;

public class recursiveatoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int n = s.length();
        int ans = StringtoNumber(s,n-1);
        System.out.println("Int is");
        System.out.println(ans + "");

    }
    public static int StringtoNumber(String s, int last){
        if(last == 0){
            return s.charAt(last) - '0';
        }

        return StringtoNumber(s, last-1)*10 + (s.charAt(last) - '0');
    }
}
