package Lecture11;

public class Runner {
    public static void main(String[] args) {
        Benchmark benchmark = new Benchmark();

        benchmark.multiThreadFactorial(100, 1000);
        benchmark.singleThreadFactorial(100, 1000);

    }
}
