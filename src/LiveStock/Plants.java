package LiveStock;

import Main.Island.CellPosition;
import Main.Main;

public class Plants {

    public static Plants plant = new Plants();

    public Double weight;
    public final int maxPlantsOnBoard;

    public Plants() {
        this.weight = 1.0;
        this.maxPlantsOnBoard = 200;
    }

    public String getPlantIcon() {
        return "\u2618";
        // Алгоритм:
        // метод возвращает изображение обьекта plant
    }
    public void multiply () {
        CellPosition.changeCell(new Plants().getPlantIcon(), Main.random.nextInt(9));
        // Алгоритм:
        // метод создает plant в списке массива island (рандомный индекс < 9)
    }
}
