package olgalashuk231;

public class Student extends Person {
    private int group;
    private int idCart;

    public Student(String firstName, String lastName, int age, int group, int idCart) {
        super(firstName, lastName, age);
        this.group = group;
        this.idCart = idCart;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    @Override
    public void printInfo() {
        System.out.println("Студент групи " + group + " " + getLastName() + " " + getFirstName() + ", вік: " + getAge() +
                ". Номер студентського квитка: " + getIdCart());
    }
}
