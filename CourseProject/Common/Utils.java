package CourseProject.Common;

import java.util.Map;

public class Utils {

    public static <K, V> void print(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("");
    }
}
