package cn.tyy.thread;

/**
 * 用继承来实现一个线程
 * <a href="https://www.infoworld.com/article/3336222/java-challengers-6-thread-behavior-in-the-jvm.html">...</a>
 */
public class InheritingThread extends Thread {
    public InheritingThread() {
    }

    InheritingThread(String threadName) {
        super(threadName);
    }

    public static void main(String... inheriting) {
        System.out.println(Thread.currentThread().getName() + " is running");

        new InheritingThread().start();
        new InheritingThread("inheritingThread").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}