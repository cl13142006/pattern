package factory.simple;

/**
 * @author cl
 * @create 2018-12-06 17:13
 **/
public class Dog implements Zoo {
    @Override
    public void eat() {
        System.out.println("A Dog in the eat");
    }
}
