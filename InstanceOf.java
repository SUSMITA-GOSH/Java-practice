class Gen<T>{
    T o;
    Gen(T ob)
    {
        o=ob;
    }
    T get(){
        return o;
    }
}
class Gen2<T> extends Gen<T>{

    public Gen2(T o) {
        super(o);
    }
    

}

public class InstanceOf {
    public static void main(String[] args) {
        Gen<Integer>iob=new Gen<>(88);
        Gen2<Integer>iob1=new  Gen2<>(100);
        Gen2<String>iob2=new  Gen2<>("hi");
        if(iob1 instanceof Gen2<?> )
        System.out.println("iob1 is a instance of gen2");
        if(iob1 instanceof Gen<?> )
        System.out.println("iob2 is a instance of gen");
        System.out.println();
        if(iob2 instanceof Gen2<?> )
        System.out.println("iob2 is a instance of gen2");
        if(iob2 instanceof Gen<?> )
        System.out.println("iob2 is a instance of gen");
          System.out.println();
          if(iob instanceof Gen2<?> )
        System.out.println("iob is a instance of gen2");
        if(iob instanceof Gen<?> )
        System.out.println("iob is a instance of gen");

    }
    
}
