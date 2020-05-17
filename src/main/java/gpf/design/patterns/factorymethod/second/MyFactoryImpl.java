package gpf.design.patterns.factorymethod.second;


import gpf.design.patterns.factorymethod.IProduct;
import gpf.design.patterns.factorymethod.ProductChooser;

/**
 * @author ge.pengfei
 */
public class MyFactoryImpl extends MyFactory {

    @Override
    protected IProduct createProduct(Integer type) {
        return ProductChooser.get(type);
    }
}
