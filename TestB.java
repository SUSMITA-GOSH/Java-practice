// Z.java
abstract class X {
    int i;

    X(int i) {
        this.i = i;
    }

    int m(int j) {
        return i*j;
    }

    abstract int n2(int j, int k);

    void n4() {}
}

class Y extends X {
    Y(int i) {
        super(i);
    }

    int m2(int a, int b) {
        return a * b;
    }

    
    
}

class Z extends Y {
    int j;

    Z(int i, int j) {
        super(i);
        this.j = j;
    }

    @Override
    int n2(int j, int k) {
        return j + k;
    }

    void n3(String message) {
        System.out.println("Hello " + message);
    }

    int m2(int a, int b) {
        return a * b;
    }
    void n4()
    {
        System.out.println((i*10));
        i=(i+j)*2-10;
    }
}

public class TestB {
    public static void main(String[] args) {
        Z z = new Z(10, 20);
        Y y = new Y(5);

        z.n3("Java");
        System.out.println("1:" + z.m2(6, 6));
        System.out.println("2:" + y.m2(6, 6));

        X x = y;
        System.out.println("3:" + x.m(15));
        System.out.println("4:" + x.i);

        x = z;
        System.out.println("5:" + x.m(15));
        System.out.println("6:" + x.i);
        x.n4();
        x.i += 10;
        x.m(0); // This call does nothing substantial in the given context
        x.i += 10;
        x.n4(); // This call does nothing substantial in the given context
    }
}

