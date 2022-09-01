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
        Initialize init = new Initialize();
        init.start();
    }
}
