/**
 * Singleton 一个最简单的单例模式的实现
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void foo() {
        System.out.println("Aha!");
    }
}