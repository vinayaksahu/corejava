class A {
    public void show() {
        System.out.println("Hello A");
    }
}

public class SuperKeyWord extends A{
    
    public void show() {
        super.show();
        System.out.println("Hello SuperKeyWord");
    }
    public static void main(String[] args) {
        
        SuperKeyWord obj = new SuperKeyWord();

        obj.show();
    }
}