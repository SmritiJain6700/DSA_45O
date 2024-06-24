package Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}