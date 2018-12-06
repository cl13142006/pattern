package singleton;

/**
 * @author cl
 * @create 2018-12-06 13:36
 **/
public class 重量级锁 {

    private static 重量级锁 instance = null;

    private 重量级锁(){

    }

    public static synchronized 重量级锁 getSigleton(){
        if(instance == null){
            instance =  new 重量级锁();
        }
        return instance;
    }


}
