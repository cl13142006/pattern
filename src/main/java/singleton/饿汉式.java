package singleton;

/**
 * @author cl
 * @create 2018-12-06 11:50
 **/
//线程安全
public class 饿汉式 {

    private static final  饿汉式 instance = new 饿汉式();

    private 饿汉式(){
    }

    public static 饿汉式 getSingleton(){
        return instance;
    }

}
