package singleton;

/**
 * @author cl
 * @create 2018-12-06 13:44
 **/
public class 内部类 {

    private 内部类(){

    }

    public  static final 内部实例 getSingleton(){
        return 内部实例.instance;
    }



    private static class 内部实例{

        private static final 内部实例 instance = new 内部实例();

    }



}
