package HomeWork2.task1;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        if (o1.getArea() > o2.getArea())
            return 1;
        if (o1.getArea() > o2.getArea())
            return 0;
        return -1;
    }

    public void getMaxArea(Country k1, Country k2) {
        switch (compare(k1, k2)) {
            case 1:
                System.out.println("Area " + k1 + " more than area " + k2); break;
            case 0:
                System.out.println("Area " + k1 + " = area " + k2); break;
            case -1:
                System.out.println("Area " + k2 + " more than area " + k1); break;
            default:
                System.out.println("Your values is bad");
        }

    }
}
