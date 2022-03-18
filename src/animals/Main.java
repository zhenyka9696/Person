package animals;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal tom = new Cat();
        tom.sound();
        Animal rex= new Dog();
        rex.sound();

        //коллекция
        List<Animal> animals= new LinkedList<>();
        animals.add(tom);
        animals.add(rex);
        animals.add(rex);

        //Полиморфизм
        for (Animal animal: animals)
            animal.sound();
    }
}
