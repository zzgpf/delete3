package gpf.design.patterns.factorymethod.third;

/**
 * 工厂方法模式用于连接平行的类层次
 *
 * @author ge.pengfei
 */
public class GpfClient {
    public static void main(String[] args) {
        GpfFactory factory = new GpfFactoryImpl();
        factory.operate(2);
        factory.operate(1);
        factory.operate(0);
        factory.operate(999);
    }
}
