package Main;

import LiveStock.Animal.*;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import Main.Board.Board;
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
        for (int i = 0; i < 9; i++) {
            CellPosition.changeCell(new Plants(), i-1);
        }

        cell0000.add(factory.createAnimal(8));
        //list0000.add(factory.createAnimal(14));
        initBoard();
        printBoard();

        //3-5 day
        int x = 9;
        int y = 0;

        while (x > 0) {

            if (CellPosition.getCellList(y).contains(Plants.plant)) {
                Rabbit.rabbit.eat(CellPosition.getCellList(y));
            } else {
                Rabbit.rabbit.move(CellPosition.getCellList(y));
                y++;
            }
            Board.initBoard();
            printBoard();
            x--;
        }
    }
}
