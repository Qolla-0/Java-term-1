package olgalashuk231;

public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human o) {
        int rez;
        if (this.equals(o)) {
            return 0;
        }
        rez = firstName.compareToIgnoreCase(o.getFirstName());
        if (rez != 0) {
            return rez;
        }
        rez = lastName.compareToIgnoreCase(o.getLastName());
        if (rez != 0) {
            return rez;
        } else {
            return age - o.getAge();
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + age;
    }
}
