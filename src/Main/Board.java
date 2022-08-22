package Main;

import LiveStock.Animal.Animal;

import java.util.*;

public class Board {

    public static int day = 1;
    public static String[][] island = new String[3][3];
    public static List<Map<String, Double>> boardListValue = new ArrayList<>();
    public static List<Object> boardList = new ArrayList<>();
    public static Set<Object> boardSet = new HashSet<>();

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
}
