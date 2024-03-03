class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Vinayak");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExtend {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        obj.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Sahu");
            Thread.sleep(1000);
        }
    }
}
