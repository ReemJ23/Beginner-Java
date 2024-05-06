/*
1-Write a Java program that prompts the user to enter
  two numbers and an operator (+, -, *, /).
2-Implement exception handling to handle NumberFormatException
  when parsing the input strings to integers.
3-Handle ArithmeticException when attempting to divide by zero.
4-Display the result of the operation if successful,
  otherwise, display an appropriate error message.
 */



import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = (double) num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.err.println("Invalid operator!");
            }
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
