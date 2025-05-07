import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int count = countDigits(number);
        System.out.println("Number of digits: " + count);
    }
    
    public static int countDigits(int number) {
        // Handle 0 case
        if (number == 0) {
            return 1;
        }
        
        // Handle negative numbers
        number = Math.abs(number);
        
        int count = 0;
        while (number > 0) {
            number /= 10;  // Remove last digit
            count++;
        }
        return count;
    }
}