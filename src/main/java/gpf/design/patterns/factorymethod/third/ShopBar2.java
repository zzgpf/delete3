package gpf.design.patterns.factorymethod.third;

import gpf.design.patterns.factorymethod.IProduct;

/**
 * @author ge.pengfei
 */
public class ShopBar2 extends AbstractShopBar {

    public ShopBar2(IProduct product) {
        super(product);
    }

    @Override
    String name() {
        return "展示位2";
    }
}
