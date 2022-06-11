public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myThreadGroup = new ThreadGroup("My first group");

        System.out.println("Запускаю потоки...");
        for (int i = 1; i <= 4; i++) {

            final Thread myThread = new MyThread(myThreadGroup, ("Поток " + i));
            myThread.start();
        }
        Thread.sleep(15000);
        myThreadGroup.interrupt();
    }
}
