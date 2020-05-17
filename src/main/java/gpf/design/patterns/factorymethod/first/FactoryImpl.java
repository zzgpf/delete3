package gpf.design.patterns.factorymethod.first;

import gpf.design.patterns.factorymethod.IProduct;
import gpf.design.patterns.factorymethod.ProductChooser;

/**
 * @author ge.pengfei
 */

public class FactoryImpl extends AbstractFactory {
    @Override
    protected IProduct createProduct(Integer type) {
        return ProductChooser.get(type);
    }
}
