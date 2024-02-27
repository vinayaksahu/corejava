public class InstanceStatic {

    int a = 5; //instace variable
    static int b = 10; //stactic variable
    
    InstanceStatic () {
        System.out.println("Constructor called");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    { // Instance block
        System.out.println("Instance block called");
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    static {
        System.out.println("Static block called");
        //System.out.println(a); //can't access instance variable
        System.out.println(b);
        System.out.println();
    }

    @SuppressWarnings("static-access") 
    public static void main(String[] args) {
        
        InstanceStatic obj = new InstanceStatic();

        System.out.println(obj.a); //instance variable deals with onject
        System.out.println(obj.b);
        System.out.println(InstanceStatic.b); //static variable deals with class
    }
}