package Patterns;
import java.util.Scanner;

public class pattern4 {
    public static void printpattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                    System.out.printf("%d ",i);
            } 
        System.out.print("\n");
     }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern4(n);
        scanner.close();
    }


}