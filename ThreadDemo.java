import java.lang.Thread;



class T1 extends Thread {
    @Override
    public void run() {
        String message = "Happy Threading";
        for (char ch : message.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(500); // 0.5-second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // For new line after the message
    }
}

class T2 implements Runnable {
    @Override
    public void run() {
        String message = "Happy Threading";
        for (char ch : message.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(500); // 0.5-second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // For new line after the message
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Creating thread T1
        T1 thread1 = new T1();
        thread1.setPriority(7); // Set priority 7

        // Creating thread T2
        Thread thread2 = new Thread(new T2());
        thread2.setPriority(3); // Set priority 3

        // Start the threads
        thread1.start();
        thread2.start();

        // Ensure the main thread waits for other threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message indicating the main thread has ended
        System.out.println("Main thread ends last.");
    }
}
