package olgalashuk231;

public class Lecturer extends Person {
    private String department;
    private int salary;

    public Lecturer(String firstName, String lastName, int age, String department, int salary) {
        super(firstName, lastName, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Викладач кафедри " + department + " " + getLastName() + " " + getFirstName() + ", вік: " + getAge() + "." +
                "\nЗарплата: " + salary);
    }
}
