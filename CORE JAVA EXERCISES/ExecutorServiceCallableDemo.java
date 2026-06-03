import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int idx = i;
            tasks.add(() -> idx * idx);
        }
        List<Future<Integer>> results = ex.invokeAll(tasks);
        for (Future<Integer> f : results) System.out.println(f.get());
        ex.shutdown();
    }
}
