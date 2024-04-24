import java.rmi.*;
import java.util.Scanner;

public class AddClient {
    public static void main(String args[]) throws Exception {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Perform the RMI lookup and addition
        AddServerIntf obj = (AddServerIntf)Naming.lookup("AddServer");
        int result = obj.add(num1, num2);

        // Display the result
        System.out.println("Addition: " + result);
    }
}

