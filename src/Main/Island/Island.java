package Main.Island;

import Main.Settings.Color;
import java.util.*;
import static Main.Settings.IslandSettings.*;

//Класс карты острова
public class Island {

    public static int dayCount = 1; // Счетчик дней симуляции

    //Параметры карты
    public static int result = 0;
    public static final int x = islandArraySize; // Строки массива island
    public static final int y = islandArraySize; // Столбцы массива island
    public static Object[][] island = new Object[x][y];

    //Списки клеток массива

    public static List<Object> cell0000 = new ArrayList<>();
    public static List<Object> cell0001 = new ArrayList<>();
    public static List<Object> cell0002 = new ArrayList<>();
    public static List<Object> cell0003 = new ArrayList<>();
    public static List<Object> cell0004 = new ArrayList<>();
    public static List<Object> cell0005 = new ArrayList<>();
    public static List<Object> cell0006 = new ArrayList<>();
    public static List<Object> cell0007 = new ArrayList<>();
    public static List<Object> cell0008 = new ArrayList<>();

    public static List<Object> cell0100 = new ArrayList<>();
    public static List<Object> cell0101 = new ArrayList<>();
    public static List<Object> cell0102 = new ArrayList<>();
    public static List<Object> cell0103 = new ArrayList<>();
    public static List<Object> cell0104 = new ArrayList<>();
    public static List<Object> cell0105 = new ArrayList<>();
    public static List<Object> cell0106 = new ArrayList<>();
    public static List<Object> cell0107 = new ArrayList<>();
    public static List<Object> cell0108 = new ArrayList<>();

    public static List<Object> cell0200 = new ArrayList<>();
    public static List<Object> cell0201 = new ArrayList<>();
    public static List<Object> cell0202 = new ArrayList<>();
    public static List<Object> cell0203 = new ArrayList<>();
    public static List<Object> cell0204 = new ArrayList<>();
    public static List<Object> cell0205 = new ArrayList<>();
    public static List<Object> cell0206 = new ArrayList<>();
    public static List<Object> cell0207 = new ArrayList<>();
    public static List<Object> cell0208 = new ArrayList<>();

    public static List<Object> cell0300 = new ArrayList<>();
    public static List<Object> cell0301 = new ArrayList<>();
    public static List<Object> cell0302 = new ArrayList<>();
    public static List<Object> cell0303 = new ArrayList<>();
    public static List<Object> cell0304 = new ArrayList<>();
    public static List<Object> cell0305 = new ArrayList<>();
    public static List<Object> cell0306 = new ArrayList<>();
    public static List<Object> cell0307 = new ArrayList<>();
    public static List<Object> cell0308 = new ArrayList<>();

    public static List<Object> cell0400 = new ArrayList<>();
    public static List<Object> cell0401 = new ArrayList<>();
    public static List<Object> cell0402 = new ArrayList<>();
    public static List<Object> cell0403 = new ArrayList<>();
    public static List<Object> cell0404 = new ArrayList<>();
    public static List<Object> cell0405 = new ArrayList<>();
    public static List<Object> cell0406 = new ArrayList<>();
    public static List<Object> cell0407 = new ArrayList<>();
    public static List<Object> cell0408 = new ArrayList<>();

    public static List<Object> cell0500 = new ArrayList<>();
    public static List<Object> cell0501 = new ArrayList<>();
    public static List<Object> cell0502 = new ArrayList<>();
    public static List<Object> cell0503 = new ArrayList<>();
    public static List<Object> cell0504 = new ArrayList<>();
    public static List<Object> cell0505 = new ArrayList<>();
    public static List<Object> cell0506 = new ArrayList<>();
    public static List<Object> cell0507 = new ArrayList<>();
    public static List<Object> cell0508 = new ArrayList<>();

    public static List<Object> cell0600 = new ArrayList<>();
    public static List<Object> cell0601 = new ArrayList<>();
    public static List<Object> cell0602 = new ArrayList<>();
    public static List<Object> cell0603 = new ArrayList<>();
    public static List<Object> cell0604 = new ArrayList<>();
    public static List<Object> cell0605 = new ArrayList<>();
    public static List<Object> cell0606 = new ArrayList<>();
    public static List<Object> cell0607 = new ArrayList<>();
    public static List<Object> cell0608 = new ArrayList<>();

    public static List<Object> cell0700 = new ArrayList<>();
    public static List<Object> cell0701 = new ArrayList<>();
    public static List<Object> cell0702 = new ArrayList<>();
    public static List<Object> cell0703 = new ArrayList<>();
    public static List<Object> cell0704 = new ArrayList<>();
    public static List<Object> cell0705 = new ArrayList<>();
    public static List<Object> cell0706 = new ArrayList<>();
    public static List<Object> cell0707 = new ArrayList<>();
    public static List<Object> cell0708 = new ArrayList<>();

    public static List<Object> cell0800 = new ArrayList<>();
    public static List<Object> cell0801 = new ArrayList<>();
    public static List<Object> cell0802 = new ArrayList<>();
    public static List<Object> cell0803 = new ArrayList<>();
    public static List<Object> cell0804 = new ArrayList<>();
    public static List<Object> cell0805 = new ArrayList<>();
    public static List<Object> cell0806 = new ArrayList<>();
    public static List<Object> cell0807 = new ArrayList<>();
    public static List<Object> cell0808 = new ArrayList<>();

    /**
     * Алгоритм initBoard():
     * метод инициализирует массив island списками list, которые содержат в себе обьекты Animal и Plants.
     */

    public static void initBoard1() {

        // Каждая ячека массива инициализируется своим списком list
        island[0][0] = cell0000;
        island[0][1] = cell0001;
        island[0][2] = cell0002;

        island[1][0] = cell0100;
        island[1][1] = cell0101;
        island[1][2] = cell0102;

        island[2][0] = cell0200;
        island[2][1] = cell0201;
        island[2][2] = cell0202;
    }
    public static void initBoard2() {

        // Каждая ячека массива инициализируется своим списком list
        island[0][0] = cell0000;
        island[0][1] = cell0001;
        island[0][2] = cell0002;
        island[0][3] = cell0003;
        island[0][4] = cell0004;
        island[0][5] = cell0005;

        island[1][0] = cell0100;
        island[1][1] = cell0101;
        island[1][2] = cell0102;
        island[1][3] = cell0103;
        island[1][4] = cell0104;
        island[1][5] = cell0105;

        island[2][0] = cell0200;
        island[2][1] = cell0201;
        island[2][2] = cell0202;
        island[2][3] = cell0203;
        island[2][4] = cell0204;
        island[2][5] = cell0205;

        island[3][0] = cell0300;
        island[3][1] = cell0301;
        island[3][2] = cell0302;
        island[3][3] = cell0303;
        island[3][4] = cell0304;
        island[3][5] = cell0305;

        island[4][0] = cell0400;
        island[4][1] = cell0401;
        island[4][2] = cell0402;
        island[4][3] = cell0403;
        island[4][4] = cell0404;
        island[4][5] = cell0405;

        island[5][0] = cell0500;
        island[5][1] = cell0501;
        island[5][2] = cell0502;
        island[5][3] = cell0503;
        island[5][4] = cell0504;
        island[5][5] = cell0505;
    }
    public static void initBoard3() {

        // Каждая ячека массива инициализируется своим списком list
        island[0][0] = cell0000;
        island[0][1] = cell0001;
        island[0][2] = cell0002;
        island[0][3] = cell0003;
        island[0][4] = cell0004;
        island[0][5] = cell0005;
        island[0][6] = cell0006;
        island[0][7] = cell0007;
        island[0][8] = cell0008;

        island[1][0] = cell0100;
        island[1][1] = cell0101;
        island[1][2] = cell0102;
        island[1][3] = cell0103;
        island[1][4] = cell0104;
        island[1][5] = cell0105;
        island[1][6] = cell0106;
        island[1][7] = cell0107;
        island[1][8] = cell0108;

        island[2][0] = cell0200;
        island[2][1] = cell0201;
        island[2][2] = cell0202;
        island[2][3] = cell0203;
        island[2][4] = cell0204;
        island[2][5] = cell0205;
        island[2][6] = cell0206;
        island[2][7] = cell0207;
        island[2][8] = cell0208;

        island[3][0] = cell0300;
        island[3][1] = cell0301;
        island[3][2] = cell0302;
        island[3][3] = cell0303;
        island[3][4] = cell0304;
        island[3][5] = cell0305;
        island[3][6] = cell0306;
        island[3][7] = cell0307;
        island[3][8] = cell0308;

        island[4][0] = cell0400;
        island[4][1] = cell0401;
        island[4][2] = cell0402;
        island[4][3] = cell0403;
        island[4][4] = cell0404;
        island[4][5] = cell0405;
        island[4][6] = cell0406;
        island[4][7] = cell0407;
        island[4][8] = cell0408;

        island[5][0] = cell0500;
        island[5][1] = cell0501;
        island[5][2] = cell0502;
        island[5][3] = cell0503;
        island[5][4] = cell0504;
        island[5][5] = cell0505;
        island[5][6] = cell0506;
        island[5][7] = cell0507;
        island[5][8] = cell0508;

        island[6][0] = cell0600;
        island[6][1] = cell0601;
        island[6][2] = cell0602;
        island[6][3] = cell0603;
        island[6][4] = cell0604;
        island[6][5] = cell0605;
        island[6][6] = cell0606;
        island[6][7] = cell0607;
        island[6][8] = cell0608;

        island[7][0] = cell0700;
        island[7][1] = cell0701;
        island[7][2] = cell0702;
        island[7][3] = cell0703;
        island[7][4] = cell0704;
        island[7][5] = cell0705;
        island[7][6] = cell0706;
        island[7][7] = cell0707;
        island[7][8] = cell0708;

        island[8][0] = cell0800;
        island[8][1] = cell0801;
        island[8][2] = cell0802;
        island[8][3] = cell0803;
        island[8][4] = cell0804;
        island[8][5] = cell0805;
        island[8][6] = cell0806;
        island[8][7] = cell0807;
        island[8][8] = cell0808;
    }

    /**
     * Алгоритм printBoard():
     * метод выводит массив инициализированный island в консоль.
     */

    public static void printBoard() {

        System.out.println(Color.BLUE_UNDERLINED + "\nКартина на " + Island.dayCount + " день:\n" + Color.RESET);

        switch (result) { // Инициализация массива island с учетом выбора пользователя
            case 1 -> initBoard1();
            case 2 -> initBoard2();
            case 3 -> initBoard3();
        }

        for (int i = 0; i < Island.island.length; i++) {
            for (int j = 0; j < Island.island[i].length; j++) {
                System.out.print("  " + Island.island[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
        Island.dayCount++; // Следующий день
    }
}
