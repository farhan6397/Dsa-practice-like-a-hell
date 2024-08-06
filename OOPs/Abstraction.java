public class Abstraction {
    public static void main (String args[])
    {
        Mustang m = new Mustang();
       
    }
}

abstract class Animal {

    // String color;
    // Animal () {
    //     color = "Brown";
    // }
    Animal () {
        System.out.println("Animal constructor is called..");
    }

    void eat()
    {
        System.out.println("Animals Eats");
    }
    
    abstract void walk();
}

class Horse extends Animal {

    Horse () {
        System.out.println("Horse constructor is called..");
    }
    // void changeColor() {
    //     color = "Dark brown";
    // }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
class Mustang extends Horse {
     Mustang () {
        System.out.println("Mustang constructor is called..");
    }
}

class Chicken extends Animal {
    // void changeColor() {
    //     color = "Red";
    // }
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}