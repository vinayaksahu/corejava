class A {
    void a() {
        System.out.println("Class A");
    }
}
public class InheritanceSingle extends A {
    void mainMethod() {
        System.out.println("Main class");
    }
    public static void main(String[] args) {
        InheritanceSingle a = new InheritanceSingle();
        a.a();
        a.mainMethod();
    }    
}