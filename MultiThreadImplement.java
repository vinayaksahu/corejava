class A implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadImplement {
    public static void main(String[] args) {
        A obj = new A();
        Thread t = new Thread(obj);
        t.start();    
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
