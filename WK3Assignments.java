import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Assignment 1
        Write a Java program that takes an array of integers as input and performs the following tasks:

        Find and print the sum of all the elements in the array.
        Find and print the largest element in the array.
        Find and print the smallest element in the array.
        Calculate and print the average of all the elements in the array.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " +i+"th element of the array:");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];
        for (int num : arr) {
            sum += num;
            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;
        }

        double average = (double) sum / n;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Average of all elements: " + average);

        /*Assignment 2
           Write a Java program for a simple calculator that performs basic
           arithmetic operations. The program should continuously prompt the
           user to enter two numbers and select an operation
           (addition, subtraction, multiplication, or division).
           After performing the operation, the program should display
           the result. The user should have the option to continue performing
           calculations or $ to exit the program.
        */

        Scanner scan = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Select operation:");
            choice = scan.next().charAt(0);
            if(choice=='$')
                break;
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();


            double result = 0;

            switch (choice) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");

                    }
                    break;

                default:
                    System.out.println("Invalid operation!");
                    continue;
            }

            System.out.println("Result: " + result);

        } while (true);
    }
}
