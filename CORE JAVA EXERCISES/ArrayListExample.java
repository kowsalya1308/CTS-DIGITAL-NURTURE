import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names (empty to stop):");
        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) break;
            names.add(s);
        }
        System.out.println("Names: " + names);
        sc.close();
    }
}
