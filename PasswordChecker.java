import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*].*")) score++;

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Strength: Weak");
        } else if (score == 3 || score == 4) {
            System.out.println("Strength: Medium");
        } else {
            System.out.println("Strength: Strong");
        }

        // Suggestions for secure password
        if (password.length() < 8)
            System.out.println("- Use at least 8 characters");
        if (!password.matches(".*[A-Z].*"))
            System.out.println("- Add uppercase letters");
        if (!password.matches(".*[a-z].*"))
            System.out.println("- Add lowercase letters");
        if (!password.matches(".*[0-9].*"))
            System.out.println("- Include numbers");
        if (!password.matches(".*[!@#$%^&*].*"))
            System.out.println("- Include special characters");

        scanner.close();
    }
}