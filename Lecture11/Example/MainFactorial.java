package Lecture11.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Артем on 25.01.17.
 */
public class MainFactorial {
    public static void main(String[] args) {
        int n = 100;
        int k = 1000;
        singeRun(n, k);
        multiRun(n, k);
    }

    private static void singeRun(int n, int k) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= n; i++) {
            FactorialN factorialN = new FactorialN(i, k);
            factorialN.run();
        }
        long stop = System.currentTimeMillis();
        System.out.println("One thread takes " + (stop - start) + " timeMillis");

    }

    private static void multiRun(int n, int k) {
        long start = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            FactorialN factorialN = new FactorialN(i, k);

            Thread thread = new Thread(factorialN);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long stop = System.currentTimeMillis();
        System.out.println("MultiThread takes " + (stop - start) + " timeMillis");
    }
}
