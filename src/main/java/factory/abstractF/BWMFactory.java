package factory.abstractF;

/**
 * @author cl
 * @create 2018-12-06 17:31
 **/
public class BWMFactory extends  AbstractFactory {

    @Override
    public factory.abstractF.Car getCar() {
        return new BWM();
    }
}
