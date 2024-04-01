/*
Develop a Java program to represent a hierarchy of animals.
Define a base class Animal with attributes such as name, age, and sound.
Create subclasses Dog, Cat, and Bird. Each subclass should override the
makeSound() method to produce an appropriate sound for that animal.
Additionally, implement a method printDetails() in animal.
Override the method equals to compare the age in animal class
Finally, demonstrate polymorphism by creating an array of
Animal objects containing dogs, cats, and birds, and print their details.
Compare the last and the first animals in the array
 */
class Animal {
    protected String name;
    protected int age;
    protected String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sound: " + sound);
    }

    @Override
    public boolean equals(Object obj) {
        Animal animal = (Animal) obj;
        return this.age == animal.age;
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "Woof");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "Meow");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age, "Chirp");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 5);
        animals[1] = new Cat("Whiskers", 3);
        animals[2] = new Bird("Tweety", 2);

        for (Animal animal : animals) {
            animal.printDetails();
            animal.makeSound();
            System.out.println();
        }

        // Comparing the first and last animals in the array
        if (animals[0].equals(animals[animals.length - 1])) {
            System.out.println("The first and last animals have the same age.");
        } else {
            System.out.println("The first and last animals have different ages.");
        }
    }
}
