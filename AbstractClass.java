abstract class Animal {
    public int age = 20;
    void legs(String name) {
        System.out.println(name + " has 4 legs");
    }

    abstract void eat();
    abstract void sound();

}

class Cow extends Animal {
    
    @Override
    void eat() {
        System.out.println("cow eats grass." + age);
    }

    @Override
    void sound() {
        System.out.println("cow sounds ambanw");
    }
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dog eats roti.");
    }

    @Override
    void sound() {
        System.out.println("Dogs sounds bhanw bhanw");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        
        Cow c = new Cow();
        c.legs("Cow");
        c.eat();
        c.sound();

        System.out.println();

        Dog d = new Dog();
        d.legs("Dog");
        d.eat();
        d.sound();
    }
}