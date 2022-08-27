package Main;

import LiveStock.Animal.AnimalFactory;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import Main.Island.Island;
import Main.Island.CellList;
import Main.Island.CellPosition;
import java.util.Random;

import static Main.Island.Island.initBoard;
import static Main.Island.Island.printBoard;

public class Main {

    public static Random random = new Random();
    public static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {
        //1 day
        printBoard();

        //2 day
        Rabbit.rabbit.multiply();
        initBoard();
        printBoard();

        //3-22 day
        int x = 20;
        int y = CellPosition.currentPosition;
        while (x > 0) {
            CellPosition.changeCell(new Plants().getPlantIcon(), random.nextInt(CellList.values().length));
            Rabbit.rabbit.eat(CellPosition.getCellList(y));
            if (!(CellPosition.getCellList(y).contains(Plants.plant.getPlantIcon()))) {
                Rabbit.rabbit.move(CellPosition.getCellList(y));
                //CellPosition.changeCell(new Plants().getPlantIcon(), random.nextInt(CellList.values().length));
                y++;
            }
            Island.initBoard();
            printBoard();
            x--;
        }
    }
}
