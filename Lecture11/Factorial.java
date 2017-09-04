package Lecture11;

import java.math.BigInteger;

public class Factorial {

    public BigInteger getFactorial(int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= k; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
