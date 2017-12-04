package shelter;

final public class Worm extends Animal {

    public Worm(int weight, String name, int age) {
        super(weight, name, age);
    }

    public void regenerate() {
        System.out.println("Червячок живой!!");
    }

    //Переопределение
    @Override
    public void sleep() {
        System.out.println("Червячок " + super.getName() + " спит");
    }

    @Override
    public String toString() {
        return "Червячок " + super.getName();
    }
}
