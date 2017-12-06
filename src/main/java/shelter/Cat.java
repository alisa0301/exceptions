package shelter;

import lombok.*;

@Description(value = "В мире животных")
@Getter
@Setter
public class Cat extends Animal implements Speakable {

    private Sort sort;

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

    public Cat(int weight, String name, int age) {
        super(weight, name, age);
    }
}
