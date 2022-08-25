package Main;

import LiveStock.Animal.*;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import Main.Board.Board;
import Main.Board.CellList;
import Main.Board.CellPosition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static Main.Board.Board.*;

public class Main {

    public static Random random = new Random();
    public static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {
        //1 day
        printBoard();

        //2 day
//        for (int i = 0; i < 9; i++) {
//            CellPosition.changeCell(new Plants().getPlantIcon(), i-1);
//        }

        Rabbit.rabbit.multiply();
        //cell0000.add(factory.createAnimal(random.nextInt(AnimalType.values().length)));
        //list0000.add(factory.createAnimal(14));
        initBoard();
        printBoard();

        //3-5 day
        int x = 20;
        int y = CellPosition.currentPosition;
        //int y = 8;

        while (x > 0) {
            //CellPosition.changeCell(new Plants().getPlantIcon(), random.nextInt(CellList.values().length));
            Rabbit.rabbit.eat(CellPosition.getCellList(y));
            if (!(CellPosition.getCellList(y).contains(Plants.plant.getPlantIcon()))) {
                Rabbit.rabbit.move(CellPosition.getCellList(y));
                CellPosition.changeCell(new Plants().getPlantIcon(), random.nextInt(CellList.values().length));
                y++;
            }
//            if (y >= 8) {
//                y = 0;
//                Rabbit.rabbit.move(CellPosition.getCellList(y));
//            }
            Board.initBoard();
            printBoard();
            x--;
        }
    }
}
