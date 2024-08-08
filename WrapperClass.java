/**
 * WrapperClass
 */
public class WrapperClass {

    public static void main(String[] args) {
        int n=7;
        //Integer num=new Integer(n);//boxing 
         Integer num=n;  //auto-boxing  
         //int num1=num.intValue() ;  //unboxing
         int num1=num;//aito-unboxing

         System.out.println(num1); 

         String str="24";
         int n1=Integer.parseInt(str);
         System.out.println(n1*2);

         Integer iob=Integer.valueOf(100);//boxing
     
       int i=iob.intValue();//unboxing
       System.out.println(i);
       Double iob2=Double.valueOf(86.7);
       double n3=iob+iob2;//auto unboxing
       System.out.println(n3);
       Boolean b=Boolean.valueOf("True");
       if(b)
       System.out.println("B is true");

       

     
        }
}