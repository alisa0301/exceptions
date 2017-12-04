package shelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shelter {


    private List<Animal> animals = new ArrayList<>();

    public void addNewAnimal(Animal animal) {
        animals.add(animal);
    }

    public void findAFriend         () {
        int random = new Random().nextInt(animals.size());
        System.out.println("Для " + animals.get(random) +
        " найден друг!");
        animals.remove(random);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Shelter(List<Animal> animals) {
        this.animals = animals;
    }

    public Shelter(){}
}
