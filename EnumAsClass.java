enum Car {
    Audi(100), Porsche(1000), Ferrari(10000), Rolls(19999),BMw;

    private int price;
    private Car()
    {
        price=500; 
    }

    private Car(int P) {
        this.price = P;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

/**
 * EnumAsClass
 */
public class EnumAsClass {
    public static void main(String[] args) {
        Car c = Car.Ferrari;
        System.out.println(c + " :" + c.getPrice());
        for(Car s: Car.values())
        {
            System.out.println(s + " :" + s.getPrice());
        }
    }
}
