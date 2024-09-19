public class StaticClassRe {
    public static void main(String[] args) {
        Human kunal = new Human(20, "kunal", 200000, false);
        System.out.println(kunal.married);
        Human rahul = new Human(20, "rahul", 200000, false);
        System.out.println(kunal.population);
        System.out.println(rahul.population);
        greeting(); // Call to static method
    }

    static void greeting() {
        System.out.println("Hello everyone");
         // Call to static method
    }

    static void fun() {
        System.out.println("let's party all night");
        greeting(); // Call to static method
    }

    // If we want to access a non-static method in a static class, we have to create a reference of their instance
    static void unhappy() {
        // We can't access game() because it's non-static
        StaticClassRe obj = new StaticClassRe(); // Create an instance of the class
        obj.games(); // Call the non-static method
    }

    void games() {
        System.out.println("we don't like games");
    }
}

class Human {
    int age;
    int salary;
    boolean married;
    String name;
     long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.population += 1;
    }
    Human()
    {
        System.out.println("hi");
    }
}

