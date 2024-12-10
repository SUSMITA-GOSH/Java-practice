import java.lang.Thread;


class NewThread implements Runnable{
    Thread t;
    String name;
    NewThread(String namex ){
        name=namex;
        t=new Thread(this,name);
        System.out.println("New thread "+t);
    }


    public void run(){
        try {
            for(int i=1;i<=5;i++)
            System.out.println(name+": "+i);
              Thread.sleep(10);
            
        } catch (InterruptedException e) {
            System.out.println("main thread intruptted");
        }
        System.out.println(" existing"+name);
    }
    
}

public class MultiThread {
    public static void main(String[] args) {
        NewThread t1=new NewThread("one");
        NewThread t2=new NewThread("Two");
        NewThread t3=new NewThread("Thee");
        t1.t.start();
        t2.t.start();
        t3.t.start();
        try {
            
              Thread.sleep(10);
            
        } catch (InterruptedException e) {
            System.out.println("main thread intruptted");
        }

    }
    
}
