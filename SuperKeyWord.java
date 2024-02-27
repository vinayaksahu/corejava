class A {

    A () {

    }

    A (int num) {
        System.out.println("parameterized SuperKeyWord constructor " + num);
    }

    public void show(int num ) {
        System.out.println("Show Super " +num);
    }
}

public class SuperKeyWord extends A{

    SuperKeyWord () {
        //super(); //not necessary
        System.out.println("default SuperKeyWord constructor");
    }

    SuperKeyWord (int num) {
        super(100); //necessary
        System.out.println("parameterized SuperKeyWord constructor " + num);
    }
    
    public void show(int num) {
        super.show(111);
        System.out.println("show Sub " + num);
    }
    public static void main(String[] args) {
        
        SuperKeyWord obj = new SuperKeyWord(); //default constructor
        SuperKeyWord obj1 = new SuperKeyWord(10); // parameterized constructor 


        System.out.println();
        obj.show(11);
        System.out.println();
        obj1.show(12);

    }
}