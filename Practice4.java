 abstract class Animal {
    public abstract void eat(String food);
    public abstract void sleep(int minutes);
    public abstract double move(double distance);
    public abstract void action();
}

 class Fish extends Animal  {
    @Override
    public void eat(String food) {
        System.out.println("Eating " + food + "...");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Sleeping for " + minutes + " min...");
    }

    @Override
    public double move(double distance) {
        //System.out.println(distance);
        return distance;
    }

    @Override
    public void action() {
        System.out.println("Swimming");
    }
}




public class Practice4 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat("Tuna");
        fish.sleep(120);
        System.out.println(fish.move(70000));
        fish.action();
    }
    
}
