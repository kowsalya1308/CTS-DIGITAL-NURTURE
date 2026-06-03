public class PatternMatchingSwitchDemo {
    public static void checkObject(Object o) {
        if (o instanceof Integer i) System.out.println("Integer: " + i);
        else if (o instanceof String s) System.out.println("String: " + s);
        else if (o instanceof Double d) System.out.println("Double: " + d);
        else System.out.println("Other type: " + o);
    }

    public static void main(String[] args) {
        checkObject(10);
        checkObject("hello");
        checkObject(3.14);
    }
}
