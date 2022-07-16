package cn.tyy.thread;

/**
 * 使用枚举而不是常量来设置优先级，好处在于，如果使用常量，传入一个不在1-10范围内的优先级数字，将会抛出一个IllegalArgumentException异常
 * <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html">IllegalArgumentException</a>
 *
 * 设置优先级也不意味着会被优先执行，只能说获取调度的优先级会高，实际上还要看JVM和操作系统的调度
 */
public class ThreadPriority {
    public static void main(String... threadPriority) {
        Thread moeThread = new Thread(() -> System.out.println("Moe"));
        Thread barneyThread = new Thread(() -> System.out.println("Barney"));
        Thread homerThread = new Thread(() -> System.out.println("Homer"));

        moeThread.setPriority(Thread.MAX_PRIORITY);
        barneyThread.setPriority(Thread.NORM_PRIORITY);
        homerThread.setPriority(Thread.MIN_PRIORITY);

        homerThread.start();
        barneyThread.start();
        moeThread.start();
    }
}
