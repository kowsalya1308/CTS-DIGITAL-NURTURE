public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double: " + d + " -> Int after casting: " + i);
        int j = 7;
        double dd = (double) j;
        System.out.println("Int: " + j + " -> Double after casting: " + dd);
    }
}
