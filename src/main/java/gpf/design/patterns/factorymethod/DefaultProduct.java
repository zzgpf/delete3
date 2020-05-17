package gpf.design.patterns.factorymethod;

/**
 * @author ge.pengfei
 */
public class DefaultProduct implements IProduct {
    @Override
    public String info() {
        return "试用产品是免费的哦";
    }

    @Override
    public int price() {
        return 0;
    }
}
