package gpf.design.patterns.factorymethod;

/**
 * @author ge.pengfei
 */
public interface IProduct {
    /**
     * 产品信息
     * @return
     */
    String info();

    /**
     * 产品价格
     * @return
     */
    int price();
}
