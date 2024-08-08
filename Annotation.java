import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//importjava.lang.annotatio.Annotation;
@Documented
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType:TYPE)
@interface smartphone{
    String mod()  default "A";
    int val()      default 10;
}
@smartphone(mod=" Android",val=200000)
class Brand{


    String name; int price;
      public Brand(String name, int price ) {
        this.name=name;
        this.price=price;
    }
    
    
}

public class Annotation {
    public static void main(String[] args) {
        Brand b=new Brand("Nokia",100000);
        Class  c=b.getClass();
        java.lang.annotation.Annotation an=c.getAnnotation(smartphone.class);
        smartphone s=(smartphone)an;
        System.out.println(s.mod());
        System.out.println(b.name);
            
        
    }
    
}
