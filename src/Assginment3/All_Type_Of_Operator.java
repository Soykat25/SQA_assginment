package Assignment3;

public class All_Type_Of_Operator {
    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("=== Relational Operators ===");
        System.out.println("a < b  : " + (a < b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));

        System.out.println("\n=== Logical Operators ===");
        System.out.println("(a < b) && (b > 15): " + ((a < b) && (b > 15)));
        System.out.println("(a > b) || (b > 15): " + ((a > b) || (b > 15)));

        System.out.println("\n=== Ternary Operator ===");
        int min = (a < b) ? a : b;
        System.out.println("Minimum value (a < b ? a : b): " + min);

        String result = (a == b) ? "Equal" : "Not Equal";
        System.out.println("Comparison result (a == b ? 'Equal' : 'Not Equal'): " + result);

        System.out.println("\n=== Assignment Operators ===");
        int c = 5;
        System.out.println("Initial value of c: " + c);

        c += 3;
        System.out.println("After c += 3: " + c);

        c -= 2;
        System.out.println("After c -= 2: " + c);

        c *= 4;
        System.out.println("After c *= 4: " + c);

        c /= 2;
        System.out.println("After c /= 2: " + c);

        c %= 3;
        System.out.println("After c %= 3: " + c);
    }
}
