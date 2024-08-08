import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Myanno{
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String des();
}
@Myanno(str="Met2",val=90)
@What(des="tesr")
class Meta2
{
    @Myanno(str="Met",val=100)
@What(des="method")
public static void myMeth()
{
    Meta2 m=new Meta2();
    try{
        java.lang.annotation.Annotation[] an =m.getClass().getAnnotations();
        System.out.println("All annotation for met2");
        for(java.lang.annotation.Annotation a:an)
        {
            System.out.println(a);
            System.out.println();
        }
        Method m1=m.getClass().getMethod("myMeth");
        an=m1.getAnnotations();
        for(java.lang.annotation.Annotation a:an)
        {
            System.out.println(a);
            System.out.println();
        }
    }
    catch(NoSuchMethodException e)
    {
        System.out.println("no");
    }
}
public static void main(String[] args) {
    myMeth();
}

}
