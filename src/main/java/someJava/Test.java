package someJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    private static void myprint(int i) {
        System.out.println(i);
    }

    public static void test() {
        int m = 10000;
        for (int i = 2; i < Math.sqrt(m); i++) {
            for (int j = 2 * i; j < m; j += i) {
                myprint(j);
            }
        }
    }

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        test();
        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间
    }
}