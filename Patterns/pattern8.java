package Patterns;
import java.util.Scanner;

public class pattern8 {
    public static void printpattern8(int n){
        // lower stars
        for(int i=0;i<n;i++){
            // spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<2*n - 2*i+1;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern8(n);
        scanner.close();
    }


}