import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Declare variables
        double num1, num2, result;
        char operator;
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter numbers and operator
        System.out.println("Enter two numbers:");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // Perform calculation based on the operator using a switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error! Invalid operator. Please enter +, -, *, or /");
        }

        // Close the scanner
        input.close();
    }
}
