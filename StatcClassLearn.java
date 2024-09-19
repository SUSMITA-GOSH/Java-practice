public class StatcClassLearn {
    public static void main(String[] args) {
        Human kunal = new Human(20, "kunal", 200000, false);
        System.out.println(kunal.married);
        Human rahul = new Human(20, "rahul", 200000, false);
        System.out.println(kunal.population);
        System.out.println(rahul.population);
        greeting(); // Call to static method
        fun();
        unhappy();
        
    
    }

     static void greeting() {
        System.out.println("Hello everyone");//Cannot use this in a static
        //we can access a non-static in a static class
    }

    static void fun() {
        System.out.println("let's party all night");
         greeting();
    }
    //if we want access a non-staic in a static class we have to create a reference of their instace
    static void unhappy()
    {
        //game();we can't access is bcz its non-static
        StatcClassLearn obj=new StatcClassLearn();//this is the waywe referencing it
        obj.games();
       
    }
    void games()
    {
        System.out.println("we don't like games");
    } 
   
}

class Human {
    int age;
    int salary;
    boolean married;
    String name;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}//outside class cannot be static