package LiveStock.Animal;

import LiveStock.Herbivores.*;
import LiveStock.Predators.*;

public class AnimalFactory {

    AnimalType[] animalTypes = AnimalType.values();

    public Animal createAnimal(int index) {

        AnimalType name = animalTypes[index];

        return switch (name) {

            case BOAR -> new Boar();
            case BUFFALO -> new Buffalo();
            case CATERPILLAR -> new Caterpillar();
            case DEER -> new Deer();
            case DUCK -> new Duck();
            case GOAT -> new Goat();
            case HORSE -> new Horse();
            case MOUSE -> new Mouse();
            case RABBIT -> new Rabbit();
            case SHEEP -> new Sheep();

            case BEAR -> new Bear();
            case BOA -> new Boa();
            case EAGLE -> new Eagle();
            case FOX -> new Fox();
            case WOLF -> new Wolf();

        };
    }
}
