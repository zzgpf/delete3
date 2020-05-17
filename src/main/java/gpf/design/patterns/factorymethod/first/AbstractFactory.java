package gpf.design.patterns.factorymethod.first;

import gpf.design.patterns.factorymethod.IProduct;

/**
 * @author ge.pengfei
 */
public abstract class AbstractFactory {
    /**
     * 生产产品
     * @param type
     * @return
     */
    abstract protected IProduct createProduct(Integer type);

    public void operate(Integer type){
        IProduct product = createProduct(type);
        System.out.println(product.info());
    }
}
