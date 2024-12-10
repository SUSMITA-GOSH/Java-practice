/**
 * InnerConstructor
 */
interface pau <T>{
    myclass<T> fun(T v);

    
}
class myclass<T>{
   private T v;

    myclass(T vals){
        v=vals;

    }
    T getval()
    {
        return v;
    }
}




public class Constructor {
    public static void main(String[] args) {
        pau<Integer> m =myclass<Integer>::new;
        myclass<Integer> mc=m.fun(100);
        System.out.println("val in mc is "+mc.getval());
    }
    
}
