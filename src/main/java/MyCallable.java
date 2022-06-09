import java.util.Random;
import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {
    private String name;
    protected Random random;
    private final int MIN;
    private final int MAX;

    public MyCallable(String name, int min, int max) {
        this.name = name;
        MIN = min;
        MAX = max;
        this.random = new Random();
    }


    @Override
    public Integer call() throws InterruptedException {
        Integer count = 0;

        while (true) {
            int n = MIN + random.nextInt(MAX - MIN + 1);
            if (n != MIN) {
                System.out.println("Я " + this.name + " Мое рандомное число: " + (MIN + new Random().nextInt(MAX - MIN + 1)));
                count++;
                Thread.sleep(2500);
            } else
                break;
        }
        System.out.println(this.name + " закрыт. Количество сообщений: " + count + "\n\n\n");
        return count;
    }
}