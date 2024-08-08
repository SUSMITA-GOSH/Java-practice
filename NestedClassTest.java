public class NestedClassTest {
    int a = 100; static int i = 10;
    class Inner{ int b = 200;
        void m() { System.out.println(a+" "+b+" "+i); }
    }
    static class StaticNested { int c = 300;
        void m2() { System.out.println(i); }
    }
    void display(){ Inner n = new Inner();        
        System.out.println(n.b); n.m();
        StaticNested sn = new StaticNested();
        sn.m2(); class InnerBlock {};
        InnerBlock ib = new InnerBlock();
    } //void d2() {InnerBlock ib = new InnerBlock();}
    public static void main(String[] args) {
        NestedClassTest nc = new NestedClassTest();
        nc.display(); //StaticNested sn = new StaticNested();
       // Inner in = nc.new Inner();
    }
} 

