package Kursovoj;

import Kursovoj.Properties.Name;
import Kursovoj.Properties.Price;

public class Runner {
    public static void main(String[] args) {
        ProductStorage productStorage = ProductStorage.getInctance();

        productStorage.add(new SparePart(new Name("filter"), Brand.VOLVO, new Price(906.)), 6);
        productStorage.add(new SparePart(new Name("fan belt"), Brand.VOLVO, new Price(906.)), 6);
        productStorage.add(new SparePart(new Name("lamp"), Brand.DAF, new Price(86.)), 90);
        productStorage.add(new SparePart(new Name("alternator"), Brand.MERSEDES, new Price(86.)), 10);
        productStorage.add(new SparePart(new Name("molding"), Brand.IVECO, new Price(45.)), 40);
        productStorage.add(new SparePart(new Name("bearing"), Brand.IVECO, new Price(86.)), 40);
        productStorage.add(new SparePart(new Name("carburetor"), Brand.IVECO, new Price(86.)), 40);
        productStorage.add(new SparePart(new Name("accelerator"), Brand.MERSEDES, new Price(78.)), 12);
        productStorage.add(new SparePart(new Name("axle"), Brand.MERSEDES, new Price(10.)), 11);
        System.out.println(productStorage);
        System.out.println(productStorage.sort(StorageComparators.byPrice()).toString());
        System.out.println(productStorage.sort(StorageComparators.byName()).toString());
        System.out.println(productStorage.sort(StorageComparators.byName())
                                         .sort(StorageComparators.byPrice()).toString());
        Utils.print(productStorage.search(productStorage.getNames(), "A"));
        Utils.print(productStorage.filter(productStorage.getPrices(), 80., 100.));
        Utils.print(productStorage.filter(productStorage.getNames(), "a", "b"));

    }
}
