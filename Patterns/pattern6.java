package Patterns;
import java.util.Scanner;

public class pattern6 {
    public static void printpattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                    System.out.printf("%d ",j);
            } 
        System.out.print("\n");
     }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern6(n);
        scanner.close();
    }


}