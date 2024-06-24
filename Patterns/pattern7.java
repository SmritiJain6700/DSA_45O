package Patterns;
import java.util.Scanner;

public class pattern7 {
    public static void printpattern7(int n){
        
        for(int i=0;i<n;i++){
            // spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern7(n);
        scanner.close();
    }


}