interface maxmin<T extends Comparable<T>>
{
    T min();
    T max();
}


class MyGenClass<T extends Comparable<T>> implements maxmin<T>
{
    
    T[] val;
    MyGenClass(T [] o)
    {
        val=o;
    }
    void showclass()
    {
        System.out.println("Type of T[] is "+val.getClass().getName());
    }
    public T min()
    {
        T v=val[0];
        for(int i=1;i<val.length;i++)
        {
            if(val[i].compareTo(v)<0)
            v=val[i];

        }
        return v;
    }
     
         public T max()
        {
            T v1=val[0];
            for(int i=1;i<val.length;i++)
            {
                if(val[i].compareTo(v1)>0)
                v1=val[i];
    
            }
            return v1;
        }   

    }




public class GenDemo {
    public static void main(String[] args) {
        Integer[] inus={1,2,3,4,6,7,89,88};
        MyGenClass<Integer> iob= new MyGenClass<Integer>(inus);
        iob.showclass();
        System.out.println("Min value "+iob.min());
        System.out.println("Max value "+iob.max());
        String[] in={"w","s","u","v"};
        MyGenClass<String> iob1= new MyGenClass<String>(in);
        iob1.showclass();
        System.out.println("Min value "+iob1.min());
        System.out.println("Max char "+iob1.max());


    }
    
}
