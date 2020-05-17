package gpf.design.patterns.factorymethod.third;

import gpf.design.patterns.factorymethod.IProduct;
import gpf.design.patterns.factorymethod.Product1;
import gpf.design.patterns.factorymethod.Product2;
import gpf.design.patterns.factorymethod.ProductChooser;

/**
 * @author ge.pengfei
 */
public class GpfFactoryImpl extends GpfFactory {

    @Override
    protected IProduct createProduct(Integer type) {
        return ProductChooser.get(type);
    }

    @Override
    protected AbstractShopBar chooseShopBar(IProduct product) {
        // 为商品选择展示位
        if (product instanceof Product1) {
            return new ShopBar1(product);
        } else if (product instanceof Product2) {
            return new ShopBar2(product);
        }
        return null;
    }
}
