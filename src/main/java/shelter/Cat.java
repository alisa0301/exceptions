package shelter;

import shelter.Description;
import shelter.Sort;
import shelter.Speakable;

@Description(value = "В мире животных")
public class Cat extends Animal implements Speakable {

    Sort sort;

    //Перегрузка -> методы с одним названием, но разной сигнатурой
    public void seatOnHands() {
        System.out.println("Не хочу!");
    }

    public void seatOnHands(int force) {
        if (force > super.getWeight()) {
            System.out.println("Кисонька сидит на ручках");
        } else {
            seatOnHands();
        }
    }

    @Override
    public void sleep() {
        System.out.println("Кисонька мягкая пушистая спит");
    }

    @Override
    public String toString() {
        if (this.sort!=null) {
            return this.sort.getName() + " " + super.getName();
        }
        return "Кошечка " + super.getName();
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    @Override
    public void roar() {
        if (this.sort == Sort.MANUL) { //Использование enum
            System.out.println("Погладь кота!\n" +
                    "Это же " + sort.getName());
        } else {
            System.out.println("РРРРР");
        }
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Cat(int weight, String name, int age) {
        super(weight, name, age);
    }
}
