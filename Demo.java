enum Status
{
    Running,Failed,Pending,Success;//object 
}
public class Demo
{

    public static void main(String[] args)
    {
        Status s;
        s=Status.valueOf("Running");
        System.out.println("the situation "+s);
        s=Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss= Status .values();
        for(Status s1:ss)
        {
     System.out.println(s1 +" : "+s1.ordinal());
        
   }
    
}
}