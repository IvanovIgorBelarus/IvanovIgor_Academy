package HomeWork2.task1;

import static HomeWork2.task1.Country.*;


public class Main {
    public static void main(String[] args) {
        Country.main(args);
        System.out.println();
        System.out.println(Country.valueOf("RUSSIA") == RUSSIA);
        System.out.println();
        //System.out.println(Countries.valueOf("BELARUS"));   Exception in thread "main" java.lang.IllegalArgumentException: No enum constant HomeWork2.task1.Countries.BELARUS
        CountryAreaComparator comparator = new CountryAreaComparator();
        comparator.getMaxArea(RUSSIA, CHINA);
        comparator.getMaxArea(USA, SUDAN);

    }
}
