package HomeWork4;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        {
            if (o1.age>o2.age)
                return 1;
            if (o1.age<o2.age)
                return 0;
            if (o1.age==o2.age)
                return 2;
           return -1;
        }
    }


}
