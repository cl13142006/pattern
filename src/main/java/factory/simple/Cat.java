package factory.simple;

/**
 * @author cl
 * @create 2018-12-06 17:13
 **/
public class Cat implements Zoo {
    @Override
    public void eat() {
        System.out.println("A Cat in the eat");
    }
}
