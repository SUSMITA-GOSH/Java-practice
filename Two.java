class TwoGen<T,V>
{
    T ob1;
    V ob2;
    TwoGen( T o,V o1)
    {
        ob1=o;
        ob2=o1;
    }
    void ShowType(){
        System.out.println("T type ="+ob1.getClass().getName()); 
        System.out.println("V type= "+ob2.getClass().getName());
         

    }
       T getobj1()
       {
        return ob1;
       }
       V getobj2()
       {
        return ob2;
       }


       
       public class Two {
       
        public static void main(String[] args) {  
            TwoGen<Integer,String> t=new TwoGen<Integer,String>(90, "Generic");
            t.ShowType();
            String str=t.getobj2();
            System.out.println(str);
            int v= t.getobj1();
            System.out.println(v);
        }
       }
}