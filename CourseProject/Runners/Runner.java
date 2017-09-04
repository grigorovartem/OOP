package CourseProject.Runners;

import CourseProject.Entity.Brand;
import CourseProject.Entity.SparePart;
import CourseProject.Filtration.MultiFiltrator;
import CourseProject.Filtration.PartVerificator;
import CourseProject.Service.ProductStorage;
import CourseProject.Sorting.StorageComparators;

public class Runner {
    public static void main(String[] args) {
        ProductStorage productStorage = ProductStorage.getInctance();

        productStorage.add(new SparePart("filter", Brand.VOLVO, 906.), 6)
        .add(new SparePart("fan belt", Brand.VOLVO, 906.), 6)
        .add(new SparePart("lamp", Brand.DAF, 86.), 90)
        .add(new SparePart("alternator", Brand.MERSEDES, 86.), 10)
        .add(new SparePart("molding", Brand.IVECO, 45.), 40)
        .add(new SparePart("bearing", Brand.IVECO, 86.), 40)
        .add(new SparePart("carburetor", Brand.IVECO, 86.), 40)
        .add(new SparePart("accelerator", Brand.MERSEDES, 78.), 12)
        .add(new SparePart("axle", Brand.MERSEDES, 10.), 11);
        System.out.println(productStorage);
        System.out.println(productStorage.sort(StorageComparators.byPrice()).toString());
        System.out.println(productStorage.sort(StorageComparators.byName()).toString());
        System.out.println(productStorage.sort(StorageComparators.byName())
                                         .sort(StorageComparators.byPrice()).toString());
        System.out.println(productStorage.filter(PartVerificator.nameStartsWith("A")));
        System.out.println(productStorage.filter(PartVerificator.priceBetween(80., 100.)));
        System.out.println(productStorage.filter(PartVerificator.nameContains("tor")));
        System.out.println(productStorage.filter(MultiFiltrator.andFilter(
                PartVerificator.nameStartsWith("A"), PartVerificator.priceBetween(80., 100.)
        )));

    }
}
