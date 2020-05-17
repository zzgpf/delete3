package gpf.design.patterns.factorymethod.third;

import gpf.design.patterns.factorymethod.IProduct;

/**
 * @author ge.pengfei
 */
public class ShopBar1 extends AbstractShopBar {

    public ShopBar1(IProduct product) {
        super(product);
    }

    @Override
    String name() {
        return "展示位1";
    }
}
