package CourseProject.Filtration;

import CourseProject.Filtration.Filterable;

import java.util.HashMap;
import java.util.Map;

public class Filtrator {

    public static <K, V> Map<K, V> filter(Map<K, V> map, Filterable<K> filterable){
        Map<K, V> filtered = new HashMap<K, V>();
        for (Map.Entry<K, V> entry : map.entrySet()){
            if (filterable.verify(entry.getKey())){
                filtered.put(entry.getKey(), entry.getValue());
            }
        }
        return filtered;
    }
}
