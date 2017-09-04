package Lecture11;

import java.util.ArrayList;
import java.util.List;

public class Benchmark {

    public void singleThreadFactorial(int n, int k) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            ThreadFactorial threadFactorial = new ThreadFactorial(n, k);
            threadFactorial.run();
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("SingleThread calculate " + (stopTime - startTime) + " ms");
    }

    public void multiThreadFactorial(int n, int k) {
        long startTime = System.currentTimeMillis();
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Runnable factorial = new ThreadFactorial(n, k);
            Thread thread = new Thread(factorial);
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

        long stopTime = System.currentTimeMillis();
        System.out.println("MultiThread calculate " + (stopTime - startTime) + " ms");
    }
}
