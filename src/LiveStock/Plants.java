package LiveStock;

import LiveStock.Herbivores.Caterpillar;
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

    public String getPlantIcon() {
        return Color.GREEN_BOLD + "\u2618" + Color.RESET;
        // Алгоритм:
        // метод возвращает изображение обьекта plant
    }
    public void multiply () {
        CellPosition.changeCell(new Plants().getPlantIcon(), Main.random.nextInt(9));
        if (Main.random.nextInt(100) < 30) Caterpillar.caterpillar.multiply();
        System.out.println(Color.GREEN_UNDERLINED + this.getClass().getSimpleName() + " multiply" + Color.RESET);
        StatisticData.plantBornCount++;
        // Алгоритм:
        // метод создает plant в списке массива island (рандомный индекс < 9)
    }
}
