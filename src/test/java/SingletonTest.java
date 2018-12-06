import singleton.双重检查所;
import singleton.懒汉式;
import singleton.重量级锁;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cl
 * @create 2018-12-06 14:17
 **/
public class SingletonTest {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch cdl = new CountDownLatch(1);
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i = 0;i<10;i++){
            es.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        cdl.await();
                        System.out.println(System.currentTimeMillis()+"===>"+懒汉式.getSingleton());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        System.out.println("并发准备！！！");
        Thread.sleep(1000);
        cdl.countDown();
        es.shutdown();
    }

}
