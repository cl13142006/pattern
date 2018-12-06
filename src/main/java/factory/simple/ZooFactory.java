package factory.simple;

/**
 * @author cl
 * @create 2018-12-06 17:15
 **/
public class ZooFactory {

    public static Zoo getZooInstance(String type){
        if("cat".equals(type)){
            return new Cat();
        }else if("dog".equals(type)){
            return new Dog();
        }else{
            return null;
        }
    }


}
