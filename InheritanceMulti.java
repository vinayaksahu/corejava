interface A {
    void a();
}
interface B {
    void b();
}
public class InheritanceMulti implements A,B {

    @Override
    public void a() {
        System.out.println("A class");
    }

    @Override
    public void b() {
        System.out.println("B class");
    }

    void mainMethod() {
        System.out.println("Main class");
    }
    public static void main(String[] args) {
        InheritanceMulti in = new InheritanceMulti();
        in.a();
        in.b();
        in.mainMethod();
    }    
}