import java.util.List;
import java.util.stream.Collectors;

public class PersonRecordDemo {
    public static record Person(String name, int age) {}

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice",30), new Person("Bob",17));
        List<Person> adults = people.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());
        System.out.println(adults);
    }
}
