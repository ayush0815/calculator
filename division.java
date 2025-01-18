import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double num2 = scanner.nextDouble();
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("The quotient is: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        scanner.close();
    }
}
