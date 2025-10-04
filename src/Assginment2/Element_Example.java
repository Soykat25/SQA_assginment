package Assginment2;

public class Element_Example {
    // Fields / Variables (Instance variables)
    String name = "Soykat";
    int age = 26;

    //Static Field (Class Variable)
    static String company = "bracIT";

    // 3 Final Field (Constant)
    final String country = "Bangladesh";

    //Static Block – runs only once when the class is loaded
    static {
        System.out.println("Static Block: Class is being loaded...");
    }

    // Instance Block – runs every time an object is created (before constructor)
    {
        System.out.println("Instance Block: New object is being created...");
    }

    //  Constructors
    // Default Constructor
    public Element_Example() {
        System.out.println("Default Constructor: Object created with default values.");
    }

    // Parameterized Constructor
    public Element_Example(String name, int age) {
        System.out.println("Parameterized Constructor: Object created with given values.");
        this.name = name;
        this.age = age;
    }

    // Instance Method – defines behavior for an object
    public void displayInfo() {
        System.out.println("----- Employee Information -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
        System.out.println("Country: " + country);
    }

    // Static Method – belongs to the class, not the object
    public static void showCompany() {
        System.out.println("Static Method: Company is " + company);
    }

    // Nested Class – class defined inside another class
    static class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDepartment() {
            System.out.println("Department: " + deptName);
        }
    }

    // Nested Interface – interface defined inside a class
    interface Greeting {
        void sayHello();
    }

    // Main Method – Program entry point
    public static void main(String[] args) {

        // A. Object using default constructor
        Element_Example emp1 = new Element_Example();
        emp1.displayInfo();

        System.out.println("----------------------------");

        // B. Object using parameterized constructor
        Element_Example emp2 = new Element_Example("John", 30);
        emp2.displayInfo();

        System.out.println("----------------------------");

        // C. Calling static method
        Element_Example.showCompany();

        System.out.println("----------------------------");

        // D. Using Nested Class
        Department dept = new Department("Software Development");
        dept.showDepartment();

        System.out.println("----------------------------");

        // E. Using Nested Interface (Anonymous Class Implementation)
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello! Welcome to the Java Class Elements Example.");
            }
        };
        greeting.sayHello();
    }


}
