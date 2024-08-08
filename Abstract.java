abstract class A{
    int x=10;
    A(int x){ this.x=x; System.out.println("Const: A="+x);}
    void m(){System.out.println("AM:"+x);}
    abstract void d(); {System.out.println("BL A1");}
}
class B extends A{
    int x=20;int y=30;
    {
        System.out.println("BL B1");
    }
    B(int x,int y){super(x); this.y=y;
    System.out.println("Const: B="+y);
    }
    void m(){System.out.println("BM:"+x++);}
    void d(){super.x++; System.out.println("BD:"+x);}
    static{System.out.println("SBL B2");}
}

public class Abstract { 
    public static void main(String[] args) {
        B b= new B(100,200); b.d(); b.m();
        A a = b; a.d(); a.m();
        System.out.println(a.x+" "+b.x);
    }
    
}