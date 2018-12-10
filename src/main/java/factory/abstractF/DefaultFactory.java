package factory.abstractF;

/**
 * @author cl
 * @create 2018-12-10 9:33
 **/
public class DefaultFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new BWM();
    }
}
