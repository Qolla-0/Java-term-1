package olgalashuk231;

import java.util.Comparator;

public class HumanComparatorByLName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
