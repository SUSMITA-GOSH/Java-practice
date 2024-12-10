interface MyClass<T>{
    int fun(T[] vals,T v);
}
class MyArray{
    static <T> int matching(T[]val,T v){
        int count=0;
        for(int i=0;i<=val.length;i++)
            if(val[i]==v)
            count++;
            return count;
        

    }
}



public class LambdaMet {
    static <T> int My(MyClass<T> sf, T[] val, T v) {
        return sf.fun(val, v);
    }
    public static void main(String[] args) {
        Integer[] inums={1,2,3,4,5,6,7,8,9};
        Character[] ch={'a','b','r','w','a'} ;
        int count=0;
        count=My(MyArray::<Integer>matching,inums,4);
        System.out.println(count);
        count=My(MyArray::<Character>matching,ch,'a');
        System.out.println(count);
    }
}
