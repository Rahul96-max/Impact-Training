import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int sum = sumSecondAndLastDigit(number);
        
        System.out.println("Sum of second and last digit: " + sum);
    }
    
    public static int sumSecondAndLastDigit(int number) {
        // Handle negative numbers by converting to positive
        number = Math.abs(number);
        
        // Get the last digit
        int lastDigit = number % 10;
        
        // Remove the last digit to find the second digit
        number /= 10;
        
        // If number has only one digit, second digit is 0
        int secondDigit = 0;
        if (number > 0) {
            secondDigit = number % 10;
        }
        
        return secondDigit + lastDigit;
    }
}