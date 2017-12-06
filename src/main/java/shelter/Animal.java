package shelter;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
