public class ClassObj {

    String Name;
    int age;
    
    public static void main(String[] args) {
        
        ClassObj obj1 = new ClassObj();

        obj1.Name = "Vinayak";
        obj1.age = 30;

        System.out.println("Name " + obj1.Name);
        System.out.println("Age: " + obj1.age);
    }
}