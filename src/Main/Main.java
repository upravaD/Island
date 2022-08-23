package Main;

import LiveStock.Animal.*;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import Main.Board.Board;

import java.util.Random;

import static Main.Board.Board.*;

public class Main {

    Random random = new Random();
    public static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {

        printBoard();
        list0000.add(0, new Plants());
        list0000.add(1, factory.createAnimal(8));
        list0000.add(2, factory.createAnimal(14));
        list0001.add(0, new Plants());
        initBoard();
        printBoard();

        int x = 3;
        while (x > 0) {
            Rabbit.rabbit.eat();
            Rabbit.rabbit.move();
            Board.initBoard();
            printBoard();
            x--;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
