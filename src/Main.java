public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Counter ct1 = Counter.getCounter();
            System.out.println("Thread " + Thread.currentThread().getName() + " started");
            ct1.count();
            System.out.println("Thread " + Thread.currentThread().getName() + " finished");
        });

        Thread thread2 = new Thread(() -> {
            Counter ct2 = Counter.getCounter();
            System.out.println("Thread " + Thread.currentThread().getName() + " started");
            ct2.count();
            System.out.println("Thread " + Thread.currentThread().getName() + " finished");
        });

        thread1.start();
        thread2.start();
    }
}