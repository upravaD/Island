package Main;

import LiveStock.Animal.AnimalFactory;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import Main.Island.Island;
import Main.Island.CellList;
import Main.Island.CellPosition;
import Main.Settings.Initialize;

import java.util.Random;

import static Main.Island.Island.initBoard;
import static Main.Island.Island.printBoard;

public class Main {

    public static Random random = new Random();
    public static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {
//        //1 day
//        printBoard();
//
//        //2 day
//        Rabbit.rabbit.multiply();
//        Plants.plant.multiply();
//        initBoard();
//        printBoard();
//
//        //3-22 day
//        int x = 0;
//        while (x < 20) {
//            Plants.plant.multiply();
//            Rabbit.rabbit.eat(CellPosition.getCellList(x));
//            Island.initBoard();
//            printBoard();
//            x++;
//        }
        Initialize init = new Initialize();
        init.start();
    }
}
