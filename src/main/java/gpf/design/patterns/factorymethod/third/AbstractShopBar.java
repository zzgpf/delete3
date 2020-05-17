package gpf.design.patterns.factorymethod.third;

import gpf.design.patterns.factorymethod.IProduct;

/**
 * @author ge.pengfei
 *
 * 商品位，一个商品位展示一个产品
 */
public abstract class AbstractShopBar {

    private IProduct product;

    public AbstractShopBar(IProduct product) {
        this.product = product;
    }

    public void sell() {
        System.out.println(name() + "：" + product.info() + "，卖了" + product.price() + "RMB");
    }

    /**
     * 展示位名称
     * @return
     */
    abstract String name();
}
