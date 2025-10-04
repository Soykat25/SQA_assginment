package Assginment2;

public class Arithmetic_Operator_Example {
    // Fields (Instance variables)
    int a = 10;
    int b = 5;

    // Constructor
    public Arithmetic_Operator_Example() {
        System.out.println("Arithmetic Operator Example Program");
    }

    // Method: Perform arithmetic operations
    public void performOperations() {

        // Addition (+)
        int sum = a + b;
        System.out.println("Addition (a + b): " + sum);

        // Subtraction (-)
        int difference = a - b;
        System.out.println("Subtraction (a - b): " + difference);

        //Multiplication (*)
        int product = a * b;
        System.out.println("Multiplication (a * b): " + product);

        //Division (/)
        int quotient = a / b;
        System.out.println("Division (a / b): " + quotient);

        // Modulus (%)
        int remainder = a % b;
        System.out.println("Modulus (a % b): " + remainder);
    }

    //Main Method – Program entry point
    public static void main(String[] args) {
        // Create object
        Arithmetic_Operator_Example example = new Arithmetic_Operator_Example();

        // Call method
        example.performOperations();
    }
}
