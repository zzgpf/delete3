package gpf.design.patterns.factorymethod.second;

import gpf.design.patterns.factorymethod.DefaultProduct;
import gpf.design.patterns.factorymethod.IProduct;

/**
 * @author ge.pengfei
 */
public class MyFactory {
    protected IProduct createProduct(Integer type){
        return new DefaultProduct();
    }

    public void operate(Integer type){
        IProduct product = createProduct(type);
        System.out.println(product.info());
    }
}
