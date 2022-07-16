package cn.tyy.thread;

/**
 * 用接口来实现一个线程
 * <a href="https://www.infoworld.com/article/3336222/java-challengers-6-thread-behavior-in-the-jvm.html">...</a>
 */
public class RunnableThread implements Runnable{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(new RunnableThread()).start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
