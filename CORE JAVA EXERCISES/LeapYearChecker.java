import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = sc.nextInt();
        boolean isLeap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        System.out.println(y + (isLeap ? " is a leap year." : " is not a leap year."));
        sc.close();
    }
}
