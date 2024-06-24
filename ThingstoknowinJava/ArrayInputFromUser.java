package ThingstoknowinJava;

import java.util.Scanner;

public class ArrayInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        
        System.out.println("Enter the array elements");
        int[] array = new int[size];
        // for loop 
        for(int i=0; i<size;i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Print the elements of array");
        for(int i=0; i< size;i++){
            System.out.println(array[i]);
        }

        // while loop
        int i = 0;
        while(i < size){
            array[i] = scanner.nextInt();
            i += 1;
        }

        System.out.println("Print the elements of array - while loop");
        i = 0;
        while(i < size){
            System.out.println(array[i]);
            i += 1;
        }

        scanner.close();

    }
}
