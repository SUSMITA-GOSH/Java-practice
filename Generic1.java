class A<T> {
    T ob;
    A(T o) {
        ob = o;
    }
    T getob() {
        return ob;
    }
    void show() {
        System.out.println("Welcome to Generic type of T: " + ob.getClass().getName());
    }
}


public class Generic1 {
    public static void main(String[] args) {
        A<Integer>iob=new A<Integer>(88);
        int v=iob.getob();
       
         System.out.println("value "+v);   
        iob.show();
        A<String>iob1=new A<String>("hiii");
        String v1=iob1.getob();
       
         System.out.println("value "+v1);   
        iob.show();
        
    }
    
}
