package gpf.design.patterns.factorymethod.first;

/**
 * @author ge.pengfei
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new FactoryImpl();
        abstractFactory.operate(null);
        abstractFactory.operate(1);
        abstractFactory.operate(999);
    }
}
