abstract class A {
    int i;
    A(int i){
        this.i=i;
    }
    int m(int j){
        return i+j;
    }
    abstract int m2(int j, int k);
    void m4(){}
}
class B extends A {
    B(int i)
    {
        super(i);
    }
int m2(int x, int y){
    return x+y;
}

class C extends B{
    int j;

C(int i, int j){
    
    super(i);
    this.j=j;
    
}
int m2(int e, int f) {
    return e * f; 
}

void m3(String s) {
    System.out.println("Hello " + s);
}
 void m4(){
    System.out.println(i*10);
    i=(i+j)*2-10;
 }
}


}


public class TestA {
public static void main(String[] args) {
    C c = new C(10,20);
    B b = new B(5);
    c.m3("Java");
    System.out.println("1: "+c.m2(6,6));
    System.out.println("2: "+b.m2(6,6));
    A a = b;
    System.out.println("3: "+a.m(15));
    System.out.println("4: "+a.i);
     a=c;
    System.out.println("5: "+a.m(15));
    System.out.println("6: "+a.i);
    a.m4();
    c.i+=10;
    a.m4();
    a.i+=10;
    a.m4();
}
    
}