import java.util.Random;
import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {
    private String name;
    protected Random random;
    private final int min;
    private final int max;

    public MyCallable(String name, int min, int max) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Integer call() throws InterruptedException {
        Integer count = 0;

        while (true) {
            int n = min + random.nextInt(max - min + 1);
            if (n != min) {
                System.out.println("Я " + this.name + " Мое рандомное число: " + (min + new Random().nextInt(max - min + 1)));
                count++;
                Thread.sleep(2500);
            } else
                break;
        }
        System.out.println(this.name + " закрыт. Количество сообщений: " + count + "\n\n\n");
        return count;
    }
}