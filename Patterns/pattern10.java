package Patterns;
import java.util.Scanner;

public class pattern10 {
    public static void printpattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i > n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            
            System.out.print("\n");
        }
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scanner.nextInt();
        printpattern10(n);
        scanner.close();
    }


}