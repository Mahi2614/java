public class Abstraction {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        Hustang myHorse = new Hustang();
        // Animal->Horse->Hustang

    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "brown";
        System.out.println("animal constuctir called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constuctor called");
    }

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Hustang extends Horse {
    Hustang() {
        System.out.println("hustang constuctor called");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "red";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}