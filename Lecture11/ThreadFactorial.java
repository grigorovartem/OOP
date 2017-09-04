package Lecture11;

import java.math.BigInteger;

public class ThreadFactorial implements Runnable {

    private final int i;
    private final int k;

    public ThreadFactorial(int i, int k) {
        this.i = i;
        this.k = k;
    }

    @Override
    public void run() {
        Factorial factorial = new Factorial();
        BigInteger result = factorial.getFactorial(i * k);
        FactorialUtils.printToFile(result, String.valueOf(i * k));
    }
}
