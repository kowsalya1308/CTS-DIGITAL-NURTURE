import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("JavapExample");
        for (Method m : c.getDeclaredMethods()) System.out.println(m.getName());
    }
}
