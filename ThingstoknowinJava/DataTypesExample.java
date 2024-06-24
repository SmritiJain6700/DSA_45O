package ThingstoknowinJava;
import java.util.Arrays;
public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;  // Note the 'L' suffix for long literals
        float floatVar = 3.14f;               // Note the 'f' suffix for float literals
        double doubleVar = 3.14159265359;

        char charVar = 'A';
        boolean boolVar = true;

        // Reference data types
        String strVar = "Hello, Java!";
        int[] arrayVar = {1, 2, 3, 4, 5};

        // Output values
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
        System.out.println("strVar: " + strVar);
        System.out.println("arrayVar: " + Arrays.toString(arrayVar));
    }
}
