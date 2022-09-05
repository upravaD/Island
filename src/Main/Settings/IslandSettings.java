package Main.Settings;

import Main.Island.Cell;
import Main.Island.Island;

import java.util.Scanner;

public class IslandSettings {

    Scanner scanner = new Scanner(System.in);

    public static int islandArraySize; // Размер массива island
    public static int islandDays; // Кол-во дней симуляции

    public IslandSettings() {

        System.out.println(Color.YELLOW_UNDERLINED + "\n!ДОБРО ПОЖАЛОВАТЬ В СИМУЛЯЦИЮ!\n" + Color.RESET);
        System.out.println(Color.BLUE_UNDERLINED + "Выберите размер карты" + Color.RESET + ": " );
        System.out.println("1. Маленький 3х3");
        System.out.println("2. Средний 6х6");
        System.out.println("3. Большой 9х9");
        System.out.print(Color.GREEN_UNDERLINED + "Ваш выбор" + Color.RESET + ": ");

        int x = scanner.nextInt();

        switch (x) {
            case 1 -> {
                islandArraySize = 3;
                islandDays = 10;
                Island.scannerResult = 1;
                Island.cellMaxSize = Cell.values().length-72;
            }
            case 2 -> {
                islandArraySize = 6;
                islandDays = 15;
                Island.scannerResult = 2;
                Island.cellMaxSize = Cell.values().length-45;
            }
            case 3 -> {
                islandArraySize = 9;
                islandDays = 20;
                Island.scannerResult = 3;
                Island.cellMaxSize = Cell.values().length;
            }
            default -> System.err.println("НЕВЕРНОЕ ЧИСЛО!!! ОШИБКА!!! ПЕРЕЗАПУСТИТЕ ПРОГРАММУ!!!");
        }
    }
}
