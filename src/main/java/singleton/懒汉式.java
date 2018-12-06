package singleton;

/**
 * @author cl
 * @create 2018-12-06 11:59
 **/
//线程不安全
public class 懒汉式 {

    private static 懒汉式 instance = null;

    private 懒汉式(){

    }

    public static 懒汉式 getSingleton(){
        if(instance == null){
            instance = new 懒汉式();
        }
        return instance;
    }

}
