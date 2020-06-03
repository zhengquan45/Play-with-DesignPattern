public class ExecutorThread3 implements Runnable {
    public void run() {
        LazyInnerClassSingleton instance = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread3());
        Thread t2 = new Thread(new ExecutorThread3());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
