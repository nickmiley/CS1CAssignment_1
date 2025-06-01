import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

        // character type
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character.");
        } else {
            System.out.println(ch + " is neither a letter nor a digit.");
        }


        scanner.close();
    }
}
