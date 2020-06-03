public class ExecutorThread2 implements Runnable {
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazyDoubleCheckSingleton);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread2());
        Thread t2 = new Thread(new ExecutorThread2());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
