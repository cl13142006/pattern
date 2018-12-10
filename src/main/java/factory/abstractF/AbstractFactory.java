package factory.abstractF;

/**
 * @author cl
 * @create 2018-12-10 9:28
 **/
public abstract class AbstractFactory {

    protected abstract Car getCar();


    //这段代码就是动态配置的功能
    //固定模式的委派
    public Car getCar(String name){
        if("BMW".equalsIgnoreCase(name)){
            return new BWMFactory().getCar();
        }else if("Benz".equalsIgnoreCase(name)){
            return new BenCFactory().getCar();
        }else{
            System.out.println("这个产品产不出来");
            return null;
        }
    }


}
