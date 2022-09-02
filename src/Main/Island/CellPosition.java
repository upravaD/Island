package Main.Island;

import java.util.List;

//Класс позиции обьекта
public class CellPosition {

    //Получение индекса ячейки по списку
    public static int cellIndex(List<Object> list) { //Параметры: список ячейки массива island

        String name = "";//локальная переменная

        for (int i = 0; i < Island.island.length; i++) { // цикл по строкам массива island
            for (int j = 0; j < Island.island[i].length; j++) { // цикл по столбцам массива island
                if (Island.island[i][j].equals(list)) { // поиск списка ячейки list в массиве island
                    name = ("0"+ i +"0"+ j); // инициализация локальной переменной
                }
            }
        }
        int index = -1; // дефолтное значение индекса
        switch (name) {
            // значение index = 0-8
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

        // Алгоритм:
        // метод ищет в массиве island список list, на основе которого возвращает index этого списка в массиве island.
        // метод считается deprecated :)
    }

    //Смена позиции
    public static void changeCell(Object obj, int index) { //Параметры: обьект списка ячейки массива island и индекс списка

        switch (index) { // добавление обьекта в список ячейки
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
        // Алгоритм:
        // метод добавляет обьект obj в определенный список ячейки по индексу index
    }

    //Получение списка ячейки по индексу
    public static List<Object> getCellList(int index) { //Параметры: индекс списка массива island

        switch (index) { //Возвращает определенный список ячейки массива island по индексу index

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
        return null; // дефолтное значение

        // Алгоритм:
        // метод возвращает определенный список ячейки массива island по индексу index
    }
}
