public class Inheritance {
    public static void main(String args[])
    {
        // Fish shark = new Fish();
        // shark.eat();
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
        System.out.println(doggy.legs);

        Mammal m
    }
}
// Base Class....
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breath() {
        System.out.println("Breaths");
    }
}
// multi level inheritance....
class Mammal extends Animal {
    void walk()
    {
        System.out.println("walk");
    }
}
class Bird extends Animal {
    void fly()
    {
        System.out.println("fly");
    }
}
class fish extends Animal {
    void swim()
    {
        System.out.println("Swim");
    }
}
class Dog extends Mammal {
    String breed;
}
// Derived Class...
// class Fish extends Animal {
//     int fins;

//     void swim()
//     {
//         System.out.println("Swim in water!");
//     }
// }