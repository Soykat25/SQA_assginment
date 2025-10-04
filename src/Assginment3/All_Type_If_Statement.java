package Assignment3;

public class All_Type_If_Statement {

    public static void main(String[] args) {

        int number = 25;

        //Simple if statement
        if (number > 0) {
            System.out.println("Simple if: The number is positive.");
        }

        //if-else statement
        if (number % 2 == 0) {
            System.out.println("if-else: The number is even.");
        } else {
            System.out.println("if-else: The number is odd.");
        }

        //if-else-if ladder
        if (number < 0) {
            System.out.println("if-else-if: The number is negative.");
        } else if (number == 0) {
            System.out.println("if-else-if: The number is zero.");
        } else if (number > 0 && number <= 10) {
            System.out.println("if-else-if: The number is between 1 and 10.");
        } else if (number > 10 && number <= 20) {
            System.out.println("if-else-if: The number is between 11 and 20.");
        } else {
            System.out.println("if-else-if: The number is greater than 20.");
        }

        //Nested if statement
        if (number > 0) {
            if (number % 5 == 0) {
                System.out.println("Nested if: The number is positive and divisible by 5.");
            } else {
                System.out.println("Nested if: The number is positive but not divisible by 5.");
            }
        }
    }
}
