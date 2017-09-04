package Lecture9;

import java.util.*;

public class NumbersCounter {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(3, 6, 8, 3, 4, 8, 8, 5));
        System.out.println(NumbersCounter.countNumbers(integers));

    }

    public static Map<Integer, Integer> countNumbers(List<Integer> integerList) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer num : integerList) {
            Integer value = integerMap.get(num);
            integerMap.put(num, value == null ? 1 : value + 1);

        }
        return integerMap;
    }
}
