package ThingstoknowinJava;
import java.util.Scanner;  // Import the Scanner class

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();  // Read a line of input
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();  // Read an integer input
        
        // Display the inputs received
        System.out.println("String entered: " + inputString);
        System.out.println("Integer entered: " + inputInt);
        
        scanner.close();  // Close the Scanner object to prevent resource leak
    }
}
