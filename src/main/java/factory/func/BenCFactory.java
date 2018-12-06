package factory.func;

/**
 * @author cl
 * @create 2018-12-06 17:33
 **/
public class BenCFactory implements CarFactory {
    @Override
    public Car production() {
        return new BenC();
    }
}
