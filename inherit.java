public class inherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        Bird peacock = new Bird();
        peacock.fly();

    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

class Mammals extends Animal {
    int legs;

    void walk() {
        System.out.println("walk");
    }

}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Dog extends Mammals {
    String breed;
}

// derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}