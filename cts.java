// Java All Exercises - Combined Example Code Snippets

// 1. Hello World
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// 2. Simple Calculator
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);
        double result = switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num2 != 0 ? num1 / num2 : Double.NaN;
            default -> 0;
        };
        System.out.println("Result: " + result);
    }
}

// 3. Even or Odd
class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}

// 4. Leap Year Checker
class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(leap ? "Leap Year" : "Not a Leap Year");
    }
}

// 5. Multiplication Table
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

// 6. Data Type Demo
class DataTypeDemo {
    public static void main(String[] args) {
        int i = 10;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean b = true;
        System.out.println(i + ", " + f + ", " + d + ", " + c + ", " + b);
    }
}

// 7. Type Casting
class TypeCasting {
    public static void main(String[] args) {
        double d = 9.7;
        int i = (int) d;
        int j = 5;
        double e = j;
        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + e);
    }
}

// 8. Operator Precedence
class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result); // Output: 20
    }
}