import java.util.Scanner;

class baharWalaClass {

    public int num;
    public int age;
}

public class ClassObj {

    String Name;
    int age;
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        baharWalaClass obj2 = new baharWalaClass();
        obj2.num = input.nextInt();
        obj2.age = input.nextInt();
        System.out.println("Name " + obj2.num);
        System.out.println("Age: " + obj2.age);

        ClassObj obj1 = new ClassObj();
        obj1.Name = input.next();
        obj1.age = input.nextInt();
        System.out.println("Name " + obj1.Name);
        System.out.println("Age: " + obj1.age);

        input.close();
    }
}