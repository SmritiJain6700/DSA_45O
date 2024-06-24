package Patterns;
import java.util.Scanner;

public class pattern2 {
    public static void printpattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                    System.out.print("* ");
            } 
        System.out.print("\n");
     }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern2(n);
        scanner.close();
    }


}

