
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();

}
class MyClass<T extends Comparable<T>> implements MinMax<T>{
     
    T[] val;
    MyClass(T[] ob)
    {
        val=ob;
    }

    public T min(){
        T v=val[0];
        for(int i=0;i<val.length;i++){
            if(val[i].compareTo(v)<0) v=val[i];
            
            }
        return v;
    }
    public T max(){
        T v=val[0];
        for(int i=0;i<val.length;i++){
            if(val[i].compareTo(v)>0) v=val[i];
            

        }
        return v;
    }


}

public class Generic4 {
    public static void main(String[] args) {
        Integer[] inums={1,2,3,4,5,6,7,8,9};
        Character[] ch={'a','b','r','w'} ;
        MyClass<Integer> iob=new MyClass<Integer>(inums);
        MyClass<Character> ob=new MyClass<Character>(ch);
        System.out.println("max value "+iob.max());
        System.out.println("min value "+iob.min());
        System.out.println("max value "+ob.max());
        System.out.println("min value "+ob.min());
    }
    
}
