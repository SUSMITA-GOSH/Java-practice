


class A extends java.lang.Thread{

    // public void show(){
    //     for (int i = 0; i < 10; i++) {
    //         System.out.println("hi");}
    //     }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            
            
        }
        }
      

}
class B extends java.lang.Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");}
        }
      

}





public class Thread {
    public static void main(String[] args) {
        A obj=new A();
        B obj1=new B();
        // obj.show();
        // obj1.show();
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        //obj1.setPriority(java.lang.Thread.MAX_PRIORITY);
        obj.start();
        try {
            java.lang.Thread.sleep(10);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        obj1.start();
        try {
            java.lang.Thread.sleep(2);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
    }
    

