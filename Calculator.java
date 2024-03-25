
    /*
    Create a class called Calculator the has two integer attributes: num1 and num2
    The class should include setters and getters that validate the input to be positive
    if the user sets a negative value, setter shows error message and sets number to zero
    Write two constructors one that takes two values and one to copy objects
    The class should include 4 methods: add, sub, mul, div that returns the result of the operation (not print it)
    Division should validate input of second number ( if zero the method should return 0 and output an error message)
    In main use this method to ask the user for two numbers and print all the operations for the two numbers
    The user will be asked if they want to calculate again (type yes to calculate and no to exit),
    if invalid ask again (user might input Yes or YES)
     */

    import java.util.Scanner;

    public class Calculator {
       private int num1;
       private int num2;

       // Constructor taking two values
       public Calculator(int num1, int num2) {
              this.num1 = validatePositive(num1);
              this.num2 = validatePositive(num2);
       }

       // Copy constructor
       public Calculator(Calculator calc) {
              this.num1 = calc.getNum1();
              this.num2 = calc.getNum2();
       }

       // Getters and setters with validation
       public int getNum1() {
              return num1;
       }

       public void setNum1(int num1) {
              this.num1 = validatePositive(num1);
       }

       public int getNum2() {
              return num2;
       }

       public void setNum2(int num2) {
              this.num2 = validatePositive(num2);
       }

       // Validation method to ensure positive numbers
       private int validatePositive(int num) {
              if (num < 0) {
                     System.out.println("Input must be positive");
                     return 0;
              }
              return num;
       }

       // Method to add two numbers
       public int add() {
              return num1 + num2;
       }

       // Method to subtract two numbers
       public int sub() {
              return num1 - num2;
       }

       // Method to multiply two numbers
       public int mul() {
              return num1 * num2;
       }

       // Method to divide two numbers
       public double div() {
              if (num2 == 0) {
                     System.out.println("Error: Division by zero");
                     return 0;
              }
              return (double)num1 / num2;
       }

}
//    public class Main {
//           public static void main(String[] args) {
//                  Scanner scanner = new Scanner(System.in);
//                  String repeat;
//
//                  do {
//                         // Ask the user for two numbers
//                         System.out.print("Enter first number: ");
//                         int num1 = scanner.nextInt();
//                         System.out.print("Enter second number: ");
//                         int num2 = scanner.nextInt();
//
//                         // Create a Calculator object
//                         Calculator calc = new Calculator(num1, num2);
//
//                         // Perform operations and print results
//                         System.out.println("Addition result: " + calc.add());
//                         System.out.println("Subtraction result: " + calc.sub());
//                         System.out.println("Multiplication result: " + calc.mul());
//                         System.out.println("Division result: " + calc.div());
//
//                         // Ask the user if they want to calculate again
//
//                         System.out.print("Do you want to calculate again? (yes/no): ");
//                         repeat = scanner.next().toLowerCase();
//
//                  } while (repeat.equals("yes"));
//
//           }
//    }
