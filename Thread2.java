import java.lang.Thread;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        
        // Using a lambda expression for a Runnable task
        Runnable obj = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("lambda hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("b");
                }
            }
        };
        
        Thread t3 = new Thread(obj); // Missing semicolon corrected
        
        // Optional: Set priorities
        // t1.setPriority(Thread.MAX_PRIORITY);
        // t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start(); // Start the thread created with the lambda Runnable
    }
}
