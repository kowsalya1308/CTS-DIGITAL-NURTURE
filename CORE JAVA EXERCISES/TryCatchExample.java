import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        try {
            int r = a / b;
            System.out.println("Result: " + r);
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero.");
        }
        sc.close();
    }
}
