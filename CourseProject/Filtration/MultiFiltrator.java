package CourseProject.Filtration;

import CourseProject.Filtration.Filterable;

public class MultiFiltrator {

    public static <T> Filterable<T> andFilter(Filterable<T>... filterables) {
        return new Filterable<T>() {
            @Override
            public boolean verify(T product) {
                for (Filterable<T> filterable : filterables){
                    if (!filterable.verify(product)){
                        return false;
                    }
                }
                return true;
            }
        };
    }
}
