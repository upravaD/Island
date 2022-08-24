package Main.Board;

import Main.Main;

import java.util.ArrayList;
import java.util.List;

public class CellPosition {

    public static CellList[] cellIndexArray = CellList.values();

    public static int cellIndex(List<Object> list) {
        String name = "";
        for (int i = 0; i < Board.island.length; i++) {
            for (int j = 0; j < Board.island[i].length; j++) {
                if (Board.island[i][j].equals(list)) {
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

    public static void changeCell(Object obj, int index) {
        index += 1;
        if (index > CellList.values().length) {
            index = Main.random.nextInt(CellList.values().length);
        }
        switch (index) {
            case 0 -> Board.cell0000.add(obj);
            case 1 -> Board.cell0001.add(obj);
            case 2 -> Board.cell0002.add(obj);

            case 3 -> Board.cell0100.add(obj);
            case 4 -> Board.cell0101.add(obj);
            case 5 -> Board.cell0102.add(obj);

            case 6 -> Board.cell0200.add(obj);
            case 7 -> Board.cell0201.add(obj);
            case 8 -> Board.cell0202.add(obj);
        }
    }
    public static List<Object> getCellList(int index) {
        switch (index) {
            case 0 -> {return Board.cell0000;}
            case 1 -> {return Board.cell0001;}
            case 2 -> {return Board.cell0002;}

            case 3 -> {return Board.cell0100;}
            case 4 -> {return Board.cell0101;}
            case 5 -> {return Board.cell0102;}

            case 6 -> {return Board.cell0200;}
            case 7 -> {return Board.cell0201;}
            case 8 -> {return Board.cell0202;}
        }
        return new ArrayList<>();
    }
}
