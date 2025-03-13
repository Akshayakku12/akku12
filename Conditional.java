import java.util.Scanner; // Importing Scanner class

public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Fixed the variable naming convention
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Variable names should follow camelCase conventions
        if (age >= 18) {
            System.out.println("You are a major");
        } else {
            System.out.println("You are a minor");
        }
        scanner.close(); // Consistently using the correctly named variable
    }
}
