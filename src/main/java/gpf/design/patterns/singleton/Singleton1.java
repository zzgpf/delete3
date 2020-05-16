package gpf.design.patterns.singleton;

/*
饿汉式单例
类加载时就完成实例化，是线程安全
为何线程安全？？？
 */

/**
 * @author ge.pengfei
 */

public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    private Singleton1() {
    }
}
