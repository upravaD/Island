package Main;

import LiveStock.Animal.*;
import LiveStock.Herbivores.Herbivores;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import LiveStock.Predators.Predator;
import LiveStock.Predators.Wolf;

import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Initialize initialize = new Initialize();
//        initialize.start();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            initialize.interrupt();
//        }
        Random random = new Random();
        AnimalFactory factory = new AnimalFactory();

        Board.boardList.add(0, new Plants());
        Board.boardList.add(1, factory.createAnimal(8));
        Board.boardList.add(2, factory.createAnimal(14));
        System.out.println(Board.boardList.toString() + " " + 1);

        if (Board.boardList.get(1) instanceof Herbivores) {
            Board.boardList.set(0, null);
            System.out.println(Board.boardList.toString() + " " + 2.0);
        }
        if (Board.boardList.get(2) instanceof Predator) {
            int x = random.nextInt(100);
            if (x <= 60) {
                Board.boardList.set(1, null);
            } else {
                Board.boardList.set(2, null);
            }
            System.out.println(Board.boardList.toString() + " " + 2.1);
        }
        System.out.println(Board.boardList.toString() + " " + 3);

//        int x = 10;
//        while (x > 0) {
//            Board.boardList.add(factory.createAnimal(random.nextInt(AnimalType.values().length)));
//            x--;
//        }
//        System.out.println(Board.boardList.toString());
    }
}
