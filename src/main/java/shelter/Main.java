package shelter;

import javax.naming.NameNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {

        Worm worm = new Worm(3, "Кирилл", 6);
        System.out.println("worm = " + worm);
        Cat cat = new Cat(4, "Марси", 5);

        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(new Cat(5, "Грей", 3));
        animals.add(new Cat(2, "Василий", 1));
        Shelter shelter = new Shelter(animals);


        /**
         * Пример использования аккумулирующей функции reduce
         */
        int a = shelter.getAnimals()
                .stream()
                .map(animal -> animal.getWeight())
                .peek(System.out::println)
                .reduce((w, w1) -> w + w1)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println("a = " + a);


        /**
         *
         * Пара примеров сортировки с использованием компаратора
         */
        shelter.getAnimals()
                .stream()
                .sorted((animal, animal2) -> Integer.compare(animal2.getAge(), animal.getAge()))
                .forEach(System.out::println);

        shelter.getAnimals()
                .stream()
                .sorted(Comparator.comparing(animal -> animal.getName()))
                .forEach(System.out::println);

    }
}
