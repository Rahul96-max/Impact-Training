import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int originalNumber = number;
        
        if (number < 0) {
            number = -number;
        }
        while (number != 0) {
            int digit = number % 10; 
            sum += digit;           
            number /= 10;            
        }
        
        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);
        
        scanner.close();
    }
}