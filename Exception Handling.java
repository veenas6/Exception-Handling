import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Handling division by zero
            System.out.println("Error: Division by zero is not allowed!");
        } 
        finally {
            // Closing the scanner
            sc.close();
            System.out.println("Program execution completed.");
        }
    }
}