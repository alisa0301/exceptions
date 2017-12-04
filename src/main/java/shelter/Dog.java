package shelter;

import shelter.Speakable;

public class Dog extends Animal implements Speakable {

    public Dog(int weight, String name, int age) {
        super(weight, name, age);
    }


    @Override
    public void sleep() {
        System.out.println("Собачка " + super.getName() +
                " спит и видит колбаску");
    }

    @Override
    public String toString() {
        return "Собачка " + super.getName();
    }

    @Override
    public void speak() {
        System.out.println("Гав!");
    }

    @Override
    public void roar() {
        System.out.println("PPPPPPPPP!!");
    }
}
