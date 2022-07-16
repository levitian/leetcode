package cn.tyy.thread;

import java.util.stream.IntStream;

/**
 * 守护进程与非守护进程
 * Non-daemon threads are executed until the end. The main thread is a good example of a non-daemon thread.
 * Code in main() will be always be executed until the end, unless a System.exit() forces the program to complete.
 * A daemon thread is the opposite, basically a process that is not required to be executed until the end.
 * 自己的备注：
 * 守护进程会在主线程执行完后也停止执行
 * 100000迭代打印完成之前主线程可能就执行完成了
 *
 */
public class NonDaemonAndDaemonThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the execution in the Thread " + Thread.currentThread().getName());
        Thread daemonThread = new Thread(()-> IntStream.rangeClosed(1, 100000).forEach(System.out::println));
        daemonThread.setDaemon(true);
        daemonThread.start();
        Thread.sleep(10);
        System.out.println("End of the execution in the Thread " + Thread.currentThread().getName());
    }
}
