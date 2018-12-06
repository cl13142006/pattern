package factory.func;

/**
 * @author cl
 * @create 2018-12-06 17:31
 **/
public class BWMFactory implements CarFactory {
    @Override
    public Car production() {
        return new BWM();
    }
}
