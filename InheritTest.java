class A {
    int i; int j = 10;
    A(int i) { System.out.println("Aconst");this.i=i;}
    void m() {System.out.println(i+" "+j);}
    void m2() {System.out.println("Am2()");}
    void incI() {i+=10;}
}
class B extends A { int i=200;
    int k; B(){super(100);
        System.out.println("Bconst");super.m2();}
    void m2() {System.out.println("Bm2()");}}
class C extends B { C(){System.out.println("Cconst");}}
public class InheritTest {
    public static void main(String[] args) {
        A a = new A(100);  a.m();
        B b = new B(); b.k = 30; b.incI(); b.m();//b.i = 20;        
        System.out.println(b.i+" "+b.k); b.m2();
        a = b; System.out.println(a.i); a.m2();
        C c = new C();
    }
}