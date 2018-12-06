package singleton;

/**
 * 如果没有volatile的话 即使双重检查所也可能出现不安全问题
 * @author cl
 * @create 2018-12-06 13:59
 **/
public class 双重检查所 {

    private static volatile 双重检查所 instance = null;

    private 双重检查所(){

    }

    public static 双重检查所 getSingleton(){
        if(instance == null){
            synchronized (双重检查所.class){
                if(instance == null){
                    instance = new 双重检查所();
                }
            }
        }
        return instance;
    }


}
