public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myThreadGroup = new ThreadGroup("My first group");

        System.out.println("Запускаю потоки...");

        final Thread myThread1 = new MyThread(myThreadGroup, "Поток 1");
        final Thread myThread2 = new MyThread(myThreadGroup, "Поток 2");
        final Thread myThread3 = new MyThread(myThreadGroup, "Поток 3");
        final Thread myThread4 = new MyThread(myThreadGroup, "Поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(15000);


        myThreadGroup.interrupt();



    }
}
