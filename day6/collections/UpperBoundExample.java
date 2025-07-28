package day6.collections;
import java.util.*;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class UpperBoundExample {   //? extends Number
    public static void printSounds(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.sound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        printSounds(dogs); // valid
        printSounds(cats); // valid
    }
}
