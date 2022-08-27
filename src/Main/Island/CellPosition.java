package Main.Island;

import Main.Main;

import java.util.ArrayList;
import java.util.List;
//Класс позиции обьекта
public class CellPosition {

    public static CellList[] cellIndexArray = CellList.values();
    public static int currentPosition;
    //Получение индекса ячейки по списку
    public static int cellIndex(List<Object> list) {
        String name = "";
        for (int i = 0; i < Island.island.length; i++) {
            for (int j = 0; j < Island.island[i].length; j++) {
                if (Island.island[i][j].equals(list)) {
                    name = ("0"+ i +"0"+ j);
                }
            }
        }
        int index = -1;
        switch (name) {
            //index 0-8
            case "0000" -> index = 0;
            case "0001" -> index = 1;
            case "0002" -> index = 2;

            case "0100" -> index = 3;
            case "0101" -> index = 4;
            case "0102" -> index = 5;

            case "0200" -> index = 6;
            case "0201" -> index = 7;
            case "0202" -> index = 8;
        }
        return index;
    }
    //Смена позиции
    public static void changeCell(Object obj, int index) {
        //index += 1;
        if (index > CellList.values().length) {
            index = Main.random.nextInt(CellList.values().length);
        }
        switch (index) {
            case 0 -> Island.cell0000.add(obj);
            case 1 -> Island.cell0001.add(obj);
            case 2 -> Island.cell0002.add(obj);

            case 3 -> Island.cell0100.add(obj);
            case 4 -> Island.cell0101.add(obj);
            case 5 -> Island.cell0102.add(obj);

            case 6 -> Island.cell0200.add(obj);
            case 7 -> Island.cell0201.add(obj);
            case 8 -> Island.cell0202.add(obj);
        }
    }
    //Получение списка ячейки по индексу
    public static List<Object> getCellList(int index) {
//        if (index > 9) {
//            index = Main.random.nextInt(0,8);
//        }
        currentPosition = index;
        switch (index) {
            case 0 -> {return Island.cell0000;}
            case 1 -> {return Island.cell0001;}
            case 2 -> {return Island.cell0002;}

            case 3 -> {return Island.cell0100;}
            case 4 -> {return Island.cell0101;}
            case 5 -> {return Island.cell0102;}

            case 6 -> {return Island.cell0200;}
            case 7 -> {return Island.cell0201;}
            case 8 -> {return Island.cell0202;}
        }
        return new ArrayList<>();
    }
}
