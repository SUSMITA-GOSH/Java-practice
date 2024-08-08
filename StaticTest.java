public class StaticTest {
    static int a,b=100;
    static void m(){System.out.println("m()");}
    {System.out.println("Normal Block#1");}
    static {System.out.println("Static Block#1");}
    StaticTest(){System.out.println("Constructor");}
    public static void main(String[] args) {
        System.out.println("Main#1");
        System.out.println(StaticTest.a);
        System.out.println(StaticTest.b);
        m();
        StaticTest s = new StaticTest();
        System.out.println(s.a);
        System.out.println(s.b);
        StaticTest.a += 50;
        System.out.println(s.a);
        StaticTest s2 = new StaticTest();
        System.out.println(s2.a);
        s2.a += 200;
        System.out.println(StaticTest.a);
    }
    {System.out.println("Normal Block#2");}
    static {System.out.println("Static Block#2");}
}

