package Lecture11.Example;

import java.math.BigInteger;

/**
 * Created by Артем on 25.01.17.
 */
public class Factorial {
    public BigInteger doFactorial(int value) {
        BigInteger factorial = BigInteger.ONE;
        if (value >= 1) {
            for (int i = 1; i <= value; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            return factorial;
        } else if (value == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(-1);
        }
    }
}
