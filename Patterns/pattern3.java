package Patterns;
import java.util.Scanner;

public class pattern3 {
    public static void printpattern3(int n){
        for(int i=1;i<=n;i++){
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
        printpattern3(n);
        scanner.close();
    }


}