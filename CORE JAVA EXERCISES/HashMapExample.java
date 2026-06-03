import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter entries (id name). Enter empty id to stop.");
        while (true) {
            System.out.print("ID: ");
            String idLine = sc.nextLine();
            if (idLine.isEmpty()) break;
            int id = Integer.parseInt(idLine);
            System.out.print("Name: ");
            String name = sc.nextLine();
            map.put(id, name);
        }
        System.out.print("Enter ID to lookup: ");
        int lookup = Integer.parseInt(sc.nextLine());
        System.out.println("Name: " + map.get(lookup));
        sc.close();
    }
}
