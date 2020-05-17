package gpf.design.patterns.factorymethod.second;

/**
 * @author ge.pengfei
 */
public class MyClient {
    public static void main(String[] args) {
        MyFactory factory = new MyFactory();
        factory.operate(1);
        factory.operate(999);
        factory = new MyFactoryImpl();
        factory.operate(1);
        factory.operate(999);
    }
}
