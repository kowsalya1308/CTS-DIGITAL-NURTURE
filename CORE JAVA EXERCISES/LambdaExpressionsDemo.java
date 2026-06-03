import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana"); list.add("apple"); list.add("cherry");
        Collections.sort(list, (a,b) -> a.compareTo(b));
        System.out.println(list);
    }
}
