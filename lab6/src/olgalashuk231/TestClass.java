package olgalashuk231;

import java.util.*;

public class TestClass {
    public static void testSet() {
        HashSet<Human> s = new HashSet();
        s.add(new Human("Иван", "Иванов", 25));
        s.add(new Human("Мария", "Смирнова", 30));
        s.add(new Human("Анна", "Петрова", 22));
        s.add(new Human("Алексей", "Сидоров", 27));

        System.out.println("\nКолекція на основі HashSet: ");
        for (Human h : s) {
            System.out.println(h);
        }

        LinkedHashSet<Human> l = new LinkedHashSet<>(s);
        System.out.println("\nКолекція на основі LinkedHashSet: ");
        for (Human h : l) {
            System.out.println(h);
        }

        TreeSet<Human> t = new TreeSet<>(s);
        System.out.println("\nКолекція на основі TreeSet: ");
        for (Human h : t) {
            System.out.println(h);
        }

        TreeSet<Human> setlastName =  new TreeSet<>(new HumanComparatorByLName());
        setlastName.addAll(s);
        System.out.println("\nКолекція відсортована за фамілією: ");
        for (Human h : setlastName) {
            System.out.println(h);
        }

        TreeSet<Human> setAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        setAge.addAll(s);
        System.out.println("\nКолекція за віком: ");
        for (Human h : setAge) {
            System.out.println(h);
        }
    }
}
