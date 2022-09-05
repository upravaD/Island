package LiveStock;

import LiveStock.Herbivores.Caterpillar;
import Main.Island.Cell;
import Main.Island.CellPosition;
import Main.Main;
import Main.Settings.Color;
import Main.Settings.StatisticData;

public class Plants {

    public static Plants plant = new Plants();

    public Double weight;
    public final int maxPlantsOnBoard;

    public Plants() {
        this.weight = 1.0;
        this.maxPlantsOnBoard = 200;
    }

    /**
     * Алгоритм getPlantIcon():
     * метод возвращает изображение обьекта plant
     */

    public String getPlantIcon() {
        return Color.GREEN_BOLD + "\u2618" + Color.RESET;
    }

    /**
     * Алгоритм multiply():
     * метод создает plant в списке массива island и с вероятностью 30% появляется гусеница
     */

    public void multiply () {
        CellPosition.changeCell(new Plants().getPlantIcon(), Main.random.nextInt(Cell.values().length)); // Создаем plant
        if (Main.random.nextInt(100) < 30) Caterpillar.caterpillar.multiply(); // Создаем caterpillar
        System.out.println(Color.GREEN_UNDERLINED + this.getClass().getSimpleName() + " multiply" + Color.RESET);
        StatisticData.plantBornCount++; // Статистика
    }
}
