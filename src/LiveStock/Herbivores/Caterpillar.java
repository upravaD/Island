package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Island.CellPosition;
import Main.Main;
import Main.Settings.StatisticData;

import java.util.List;

public class Caterpillar extends Herbivores { //НЕДОДЕЛАНО!!!!!!!

    public static Caterpillar caterpillar = new Caterpillar();

    public Caterpillar() {
        super.setWeight(0.01);
        super.setMaxValueOnBoard(1000);
        super.setSpeed(0);
        super.setFoodSaturation(0);
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC1B";
    }

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

    }

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

    }

    @Override
    public void multiply() {
        this.setCurrentPosition(Main.random.nextInt(9)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(2).getIcon(), this.getCurrentPosition()); // Создаем caterpillar через AnimalFactory
        System.out.println(this.getClass().getSimpleName() + " multiply");
        StatisticData.caterpillarBornCount++;
        // Алгоритм:
        // метод создает caterpillar в списке массива island
    }
}
