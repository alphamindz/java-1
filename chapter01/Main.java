import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Check if the number is divisible by 2
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        
        input.close();
    }
}