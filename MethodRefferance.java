interface myclass<T>
{
    int fun(T[] vals,T v);
}
class myarray
{
    static <T> int matching(T[ ] vals,T v)
    {
        int count =0;
        for(int i=0;i<vals.length;i++)
        {
            if(vals[i]==v)
            {
                count++;
            }
        }
        return count;
    }
}


public class MethodRefferance {
    static <T> int myop(myclass<T> f,T[]vals,T v){return f.fun(vals,v);}
    public static void main(String[] args) {
        int count=0;
        Integer[] vals={1,2,3,4,5,5,6};
        String[] v={"one", "two", "Three"};
        count=myop(myarray::<Integer>matching,vals,4);
        System.out.println(count);
        count=myop(myarray::<String>matching,v,"two");
        System.out.println("v contain"+count+ " two");


    }
    
}
