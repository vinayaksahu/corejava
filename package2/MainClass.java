package package2;
import package1.A;

class MainClass2 extends A {
 
    public void show1() {
        System.out.println("This is mainClas2 of package2 extends class A " + data);
        show();
    }
}

public class MainClass {
    public static void main(String[] args) {
        
        MainClass2 obj = new MainClass2();

        obj.show1();
    }
}
