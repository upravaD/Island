package Main.Board;

import java.util.*;

public class Board {

    public static int day = 1;

    //Параметры карты
    private static final int x = 3;
    private static final int y = 3;

    public static Object[][] island = new Object[x][y];
    public static void initBoard() {

        island[0][0] = list0000;
        island[0][1] = list0001;
        island[0][2] = list0002;

        island[1][0] = list0100;
        island[1][1] = list0101;
        island[1][2] = list0102;

        island[2][0] = list0200;
        island[2][1] = list0201;
        island[2][2] = list0202;
    }

    //Параметры клетки
    public static List<Map<String, Double>> boardListValue = new ArrayList<>();
    public static List<Object> boardList = new ArrayList<>();

    public static List<Object> list0000 = new ArrayList<>();
    public static List<Object> list0001 = new ArrayList<>();
    public static List<Object> list0002 = new ArrayList<>();

    public static List<Object> list0100 = new ArrayList<>();
    public static List<Object> list0101 = new ArrayList<>();
    public static List<Object> list0102 = new ArrayList<>();

    public static List<Object> list0200 = new ArrayList<>();
    public static List<Object> list0201 = new ArrayList<>();
    public static List<Object> list0202 = new ArrayList<>();


    //Вывод карты на экран
    public static void printBoard() {
        System.out.println("Картина на " + Board.day + " день:");
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
