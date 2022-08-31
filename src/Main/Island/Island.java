package Main.Island;

import LiveStock.Herbivores.Rabbit;

import java.util.*;
//Класс карты острова
public class Island {

    public static int dayCount = 1;

    //Параметры карты
    private static final int x = 3;
    private static final int y = 3;
    public static Object[][] island = new Object[x][y];

    //Инициализация карты
    public static void initBoard() {

        island[0][0] = cell0000; // Каждая ячека массива инициализируется списком list
        island[0][1] = cell0001;
        island[0][2] = cell0002;

        island[1][0] = cell0100;
        island[1][1] = cell0101;
        island[1][2] = cell0102;

        island[2][0] = cell0200;
        island[2][1] = cell0201;
        island[2][2] = cell0202;

        // Алгоритм:
        // метод инициализирует массив island списками list, которые содержат в себе обьекты Animal и Plants
    }

    //Параметры клетки
    public static List<Map<String, Double>> boardListValue = new ArrayList<>();

    public static List<Object> cell0000 = new ArrayList<>();
    public static List<Object> cell0001 = new ArrayList<>();
    public static List<Object> cell0002 = new ArrayList<>();

    public static List<Object> cell0100 = new ArrayList<>();
    public static List<Object> cell0101 = new ArrayList<>();
    public static List<Object> cell0102 = new ArrayList<>();

    public static List<Object> cell0200 = new ArrayList<>();
    public static List<Object> cell0201 = new ArrayList<>();
    public static List<Object> cell0202 = new ArrayList<>();


    //Вывод карты на экран
    public static void printBoard() {
        System.out.println("\nКартина на " + Island.dayCount + " день:\n");
        initBoard();
        for (int i = 0; i < Island.island.length; i++) {
            for (int j = 0; j < Island.island[i].length; j++) {
                System.out.print("  " + Island.island[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        Island.dayCount++;
        System.out.println(Rabbit.rabbit.getCurrentPosition());
    }
}
