public class VirtualThreadsDemo {
    public static void main(String[] args) throws Exception {
        // Using regular threads for broader compatibility
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println("t: " + Thread.currentThread().getName())).start();
        }
    }
}
