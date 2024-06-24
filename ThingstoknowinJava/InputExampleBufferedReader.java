package ThingstoknowinJava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExampleBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = reader.readLine();  // Read a line of input
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int inputInt = Integer.parseInt(reader.readLine());  // Read and parse integer input
        
        // Display the inputs received
        System.out.println("String entered: " + inputString);
        System.out.println("Integer entered: " + inputInt);
        
        reader.close();  // Close the BufferedReader object
    }
}
