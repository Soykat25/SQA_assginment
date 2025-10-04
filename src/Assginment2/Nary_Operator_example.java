package Assginment2;

public class Nary_Operator_example {

    // Instance variables
    int a = 10;
    int b = 5;

    // Constructor
    public Nary_Operator_example() {
        System.out.println("N-ary Operator Example Program");
        System.out.println("----------------------------------");
    }

    // Method: Demonstrate Unary Operators
    public void unaryOperators() {
        System.out.println("---- Unary Operators ----");

        // Increment (++)
        int preIncrement = ++a; // increases before use
        System.out.println("Pre-Increment (++a): " + preIncrement);

        int postIncrement = b++; // increases after use
        System.out.println("Post-Increment (b++): " + postIncrement);
        System.out.println("Value of b after post-increment: " + b);

        // Decrement (--)
        int preDecrement = --a; // decreases before use
        System.out.println("Pre-Decrement (--a): " + preDecrement);

        int postDecrement = b--; // decreases after use
        System.out.println("Post-Decrement (b--): " + postDecrement);
        System.out.println("Value of b after post-decrement: " + b);

        // Logical NOT (!)
        boolean flag = true;
        System.out.println("Logical NOT (!flag): " + !flag);

        // Bitwise NOT (~)
        int bitwise = 5; // 0101 in binary
        System.out.println("Bitwise NOT (~5): " + ~bitwise);
    }

    // Method: Demonstrate Binary Operators
    public void binaryOperators() {
        System.out.println("\n---- Binary Operators ----");

        // Arithmetic Operators
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Relational Operators
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("(a > 5 || b > 20): " + (a > 5 || b > 20));

        // Bitwise Operators
        System.out.println("a & b (bitwise AND): " + (a & b));
        System.out.println("a | b (bitwise OR): " + (a | b));
        System.out.println("a ^ b (bitwise XOR): " + (a ^ b));
        System.out.println("a << 1 (left shift): " + (a << 1));
        System.out.println("a >> 1 (right shift): " + (a >> 1));

        // Assignment Operators
        int x = 10;
        x += 5;
        System.out.println("Assignment (x += 5): " + x);
    }

    //Method: Demonstrate Ternary Operator
    public void ternaryOperator() {
        System.out.println("\n---- Ternary Operator ----");

        // Syntax: condition ? valueIfTrue : valueIfFalse
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Ternary Result: " + result);
    }

    // Main Method - Entry Point
    public static void main(String[] args) {
        Nary_Operator_example example = new Nary_Operator_example();
        example.unaryOperators();
        example.binaryOperators();
        example.ternaryOperator();
    }
}
