class MyClass {
    //int value;
    
}

public class Stringclass {
    
    public static void main(String[] args) {
        //char ch[] = {'V', 'i', 'n', 'a', 'y'};
        MyClass name = new MyClass();       
        System.out.println(name); //will print address

        String str1 = new String("Hello");
        String str2 = new String("Hello");
    
        System.out.println(str1);
        System.out.println(str2);
        boolean check1 = str1.equals(str2);
        System.out.println(check1);
        if (str1 == str2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        String str3 = "Hello";
        String str4 = "Hello";
        boolean check2 = str3.equals(str4);
        System.out.println(check2);
        if (str3 == str4) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}