package Patterns;
import java.util.Scanner;

public class pattern5 {
    public static void printpattern5(int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                    System.out.printf("* ");
            } 
        System.out.print("\n");
     }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern5(n);
        scanner.close();
    }


}