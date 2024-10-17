package olgalashuk231;

public class Main {
    public static void main(String[] args) {

        Person student1 = new Student("Іван", "Іваненко", 19, 2, 101);
        Person student2 = new Student("Оксана", "Петренко", 18, 1, 102);
        Person lecturer1 = new Lecturer("Олег", "Тарасенко", 45, "Комп'ютерні науки", 25000);
        Person lecturer2 = new Lecturer("Наталія", "Коваленко", 38, "Математика", 23000);

        Person[] people = {student1, student2, lecturer1, lecturer2};

        for (Person p : people) {
            p.printInfo();
        }
    }
}