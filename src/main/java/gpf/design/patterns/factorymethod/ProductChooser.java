package gpf.design.patterns.factorymethod;

import java.util.Objects;

/**
 * 为了节省代码使用，真实情况可以去掉这个类
 *
 * @author ge.pengfei
 */
public class ProductChooser {
    public static IProduct get (Integer type){
        if (Objects.isNull(type)) {
            return new DefaultProduct();
        }

        switch (type) {
            case 1: return new Product1();
            case 2: return new Product2();
            default: return new DefaultProduct();
        }
    }
}
