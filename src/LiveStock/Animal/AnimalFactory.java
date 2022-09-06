package LiveStock.Animal;

import LiveStock.Herbivores.*;
import LiveStock.Predators.*;

public class AnimalFactory {

    AnimalType[] animalTypes = AnimalType.values();

    public Animal createAnimal(int index) {

        AnimalType name = animalTypes[index];

        return switch (name) {
            //  Травоядные index 0-9
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
            // Хищники index 10-14
            case BEAR -> new Bear();
            case BOA -> new Boa();
            case EAGLE -> new Eagle();
            case FOX -> new Fox();
            case WOLF -> new Wolf();

        };
    }
    public Animal multiplyAnimal(int index) {

        AnimalType name = animalTypes[index];

        switch (name) {
            // Травоядные index 0-9
            case BOAR -> {
                Boar.boar.multiply();
                return Boar.boar;
            }
            case BUFFALO -> {
                Buffalo.buffalo.multiply();
                return Buffalo.buffalo;
            }
            case CATERPILLAR -> {
                Caterpillar.caterpillar.multiply();
                return Caterpillar.caterpillar;
            }
            case DEER -> {
                Deer.deer.multiply();
                return Deer.deer;
            }
            case DUCK -> {
                Duck.duck.multiply();
                return Duck.duck;
            }
            case GOAT -> {
                Goat.goat.multiply();
                return Goat.goat;
            }
            case HORSE -> {
                Horse.horse.multiply();
                return Horse.horse;
            }
            case MOUSE -> {
                Mouse.mouse.multiply();
                return Mouse.mouse;
            }
            case RABBIT -> {
                Rabbit.rabbit.multiply();
                return Rabbit.rabbit;
            }
            case SHEEP -> {
                Sheep.sheep.multiply();
                return Sheep.sheep;
            }

            // Хищники index 10-14
            case BEAR -> {
                Bear.bear.multiply();
                return Bear.bear;
            }
            case BOA -> {
                Boa.boa.multiply();
                return Boa.boa;
            }
            case EAGLE -> {
                Eagle.eagle.multiply();
                return Eagle.eagle;
            }
            case FOX -> {
                Fox.fox.multiply();
                return Fox.fox;
            }
            case WOLF -> {
                Wolf.wolf.multiply();
                return Wolf.wolf;
            }

        }
        return null;
    }
}
