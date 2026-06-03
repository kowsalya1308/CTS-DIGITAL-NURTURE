import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to output.txt: ");
        String s = sc.nextLine();
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write(s);
            System.out.println("Written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        sc.close();
    }
}
