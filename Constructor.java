class A {
    int age;
    int salary;
    String name;

//default constuctor with initialized values
    A() {
        age = 24;
        name = "Vinay";
    } 

    A(int age, String name) {
        this.age = age;
        this.name = name;
    } 

    A(int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    } 

    A(A obj) {
        this.age = obj.age;
        this.salary = obj.salary;
        this.name = obj.name;
    }
}

public class Constructor {

    public static void main(String[] args) {
        
        A obj1 = new A(); //default constructor
        System.out.println("default constructor called");
        System.out.println(obj1.age);
        System.out.println(obj1.name);
        System.out.println();

        A obj2 = new A(30, "Vinayak"); //parameterized constructor with 2 parameter
        System.out.println("parameterized constructor with 2 parameter called");
        System.out.println(obj2.age);
        System.out.println(obj2.name);
        System.out.println();

        A obj4 = new A(30, 30000, "Vinayak"); //parameterized constructor with 3 parameter
        System.out.println("parameterized constructor with 3 parameter called");
        System.out.println(obj4.age);
        System.out.println(obj4.salary);
        System.out.println(obj4.name);
        System.out.println();
 
        A obj3 = new A(obj4); //copy constructor
        System.out.println("copy constructor called");
        System.out.println(obj3.age);
        System.out.println(obj3.salary);  
        System.out.println(obj3.name);  
        System.out.println();
    }
}