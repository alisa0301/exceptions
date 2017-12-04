package shelter;

abstract public class Animal {

    private int weight;
    private String name;
    private int age;


    // если в классе есть хотя бы один абстрактный метод,
    // класс также должен быть абстрактным
    // его класс-наследник должен или реализовать абстрактный метод,
    // или также быть абстрактным
    abstract public void sleep();

    public void eat() {
        System.out.println("Животное ест");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal(int weight, String name, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Animal() {
    }

}
