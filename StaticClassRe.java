class Person {
    String name;
    int age;
    static int totalPeople = 0; 

    // Constructor to initialize a person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPeople++;  
    }

    // Non-static method that can be overridden
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Static method
    public static void totalPopulation() {
        System.out.println("Total people created: " + totalPeople);
    }
}


class Employee extends Person {
    int salary;

    
    public Employee(String name, int age, int salary) {
        super(name, age);  
        this.salary = salary;
    }

    
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old and I earn $" + salary + ".");
    }

    
    public void work() {
        System.out.println(name + " is working.");
    }
}

public class static2{
    public static void main(String[] args) {
       
        Person john = new Person("John", 30);
        Employee emma = new Employee("Emma", 25, 50000);

        
        john.introduce();  
        emma.introduce();  

        
        Person.totalPopulation(); 

        
        emma.work();  

        
        emma.totalPopulation();
    }
}

