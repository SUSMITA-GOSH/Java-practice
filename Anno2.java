import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@interface Myanno{
    String str();
    int val();

}
class Meta {
    @Myanno(str="annotation example",val=90)
    public static void myMeth(){
        Meta ob=new Meta();
        try
        {
            Class<?> c=ob.getClass();
            Method m=c.getMethod("myMeth");
            Myanno an= m.getAnnotation(Myanno.class);
            System.out.println(an.str()+" "+an.val());

        }
        catch(NoSuchMethodException e)
        {
            System.out.println("nothing");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}








