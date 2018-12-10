package factory.abstractF;

import factory.func.BenC;
import factory.func.Car;
import factory.func.CarFactory;

/**
 * @author cl
 * @create 2018-12-06 17:33
 **/
public class BenCFactory extends  AbstractFactory {
    @Override
    public factory.abstractF.Car getCar() {
        return new factory.abstractF.BenC();
    }
}
