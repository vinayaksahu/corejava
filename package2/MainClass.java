package package2;
import package1.A;

class MainClass2 extends A {
 
    public void show1() {
        System.out.println("This is mainClas2 of package2 extends class A");
    }
}

public class MainClass {
    public static void main(String[] args) {
        
        A obj = new A();

        obj.show();
    }
}
