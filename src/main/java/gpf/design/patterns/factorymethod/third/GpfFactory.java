package gpf.design.patterns.factorymethod.third;

import gpf.design.patterns.factorymethod.IProduct;

/**
 * @author ge.pengfei
 */
public abstract class GpfFactory {
    /**
     * 生产产品
     * @param type
     * @return
     */
    abstract protected IProduct createProduct(Integer type);

    /**
     * 选择商品展示位
     * @param product
     * @return
     */
    abstract protected AbstractShopBar chooseShopBar(IProduct product);

    public void operate(Integer type){
        IProduct product = createProduct(type);
        AbstractShopBar shopBar = chooseShopBar(product);
        if (shopBar == null) {
            System.out.println("没有合适的展示位售卖此商品");
        } else {
            shopBar.sell();
        }
    }
}
