package Main;

import LiveStock.Plants;

import java.util.*;

public class Board {

    public static int day = 1;
    public static String[][] island = new String[3][3];
    public static List<Map<String, Double>> boardListValue = new ArrayList<>();

    public static void printBoard() {
        //вывод карты на экран
        for (int i = 0; i < Board.island.length; i++) {
            for (int j = 0; j < Board.island[i].length; j++) {
                System.out.print("  " + Board.island[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        Board.day++;
    }

//        while (!interrupted()) {
//            ListIterator<Object> iterator = Board.boardValue.listIterator();
//            while (iterator.hasNext()) {
//                int next = (int) iterator.next();
//                iterator.set(this.weight += 2);
//                if (next >= maxPlantsOnBoard) {
//                    setWeight(1);
//                    iterator.set(this.weight);
//                }
//            }
//        }
}
