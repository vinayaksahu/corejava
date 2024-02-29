interface Vehical {
    String name = "TVS";  //public + static + final
    int speed = 100;    //public + static + final
    void start(); //public + abstract
    void stop(); //public + abstract
}

class Customer implements Vehical{
    
    @Override
    public void start() {
        System.out.println("Start() : Insert key and press start button. " + name);
    }

    @Override
    public void stop() {
        System.out.println("Stop() : exit key. " + speed);
    }
}

public interface InterfaceVehical {
    public static void main(String[] args) {
        
        Customer c = new Customer();
        c.start(); System.out.println();
        c.stop();
    }
}