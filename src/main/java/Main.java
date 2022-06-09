import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Запускаю потоки...");

        List<Callable<Integer>> callList = new ArrayList<>();

        callList.add(new MyCallable("Поток 1", 10, 13));
        callList.add(new MyCallable("Поток 2", 7, 20));
        callList.add(new MyCallable("Поток 3",1,30));
        callList.add(new MyCallable("Поток 4", 27, 37));

        final ExecutorService threadPool = Executors.newFixedThreadPool(4);
        threadPool.invokeAll(callList);
        threadPool.invokeAny(callList);

        //Thread.sleep(15000);



    }
}
