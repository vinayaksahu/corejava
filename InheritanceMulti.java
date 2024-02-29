interface A {
    void method();
}
interface B {
    void method();
}
public class InheritanceMulti implements A,B {

    public void method() {
        System.out.println("A  & B class");
    }

    void mainMethod() {
        System.out.println("Main class");
    }
    public static void main(String[] args) {
        InheritanceMulti in = new InheritanceMulti();
        in.method();
        in.method();
        in.mainMethod();
    }    
}