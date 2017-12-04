package shelter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void divide(Integer a, Integer b) throws Throwable {
        System.out.println("a/b = " + a/b);
        throw new Exception();

    }

    public static void main(String[] args) {
        Cat cat = new Cat(4, "ghgk", 5);
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        Shelter shelter = new Shelter(animals);
        shelter.findAFriend();


        shelter.findAFriend();
    }
}
