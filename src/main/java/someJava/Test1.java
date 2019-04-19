package someJava;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class DataProcessor implements Runnable {
    public DataProcessor(int i, int m) {
        this.i = i;
        this.m = m;
    }

    @Override
    public void run() {
        for (int j = 2 * i; j < m; j += i) {
            //	System.out.println(j);
        }
    }

    private int i;
    private int m;
}


public class Test1 {

    public static void main(String[] args) {
        int m = 10000;
        ExecutorService executor = Executors.newFixedThreadPool(5);
        long startTime = System.currentTimeMillis();
        int i = 2;
        for (; i < Math.sqrt(m); i++) {
            executor.execute(new DataProcessor(i, m));
        }

        System.out.println("Starting shutdown...I:"+i);
        executor.shutdown();
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间

        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted or timed out while awaiting termination");
        }

        System.out.println("All done!");

    }
}
