class Person {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

class Employee extends Person {
    int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println(name + " " + age + " " + salary);
    }
}

/**
 * Practice1
 */
public class Practice1 {

    public static void main(String[] args) {
        Employee a = new Employee("Susmita", 22, 16000);
        a.display();
    }
}
