public class Counter {

    private Counter() {}

    private static class CounterHolder {
        private static final Counter counter = new Counter();
    }

    public static Counter getCounter() {
        return CounterHolder.counter;
    }

    public void count(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " counting: " + i);
        }
    }
}
