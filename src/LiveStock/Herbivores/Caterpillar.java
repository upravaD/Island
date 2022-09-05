package LiveStock.Herbivores;

import LiveStock.Animal.AnimalType;
import LiveStock.Plants;
import Main.Island.Cell;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;
import Main.Settings.Color;
import Main.Settings.StatisticData;

import java.util.List;

public class Caterpillar extends Herbivores {

    public static Caterpillar caterpillar = new Caterpillar();

    public Caterpillar() {
        super.setWeight(0.01);
        super.setMaxValueOnBoard(1000);
        super.setSpeed(1);
    }

    /**
     *  Алгоритм getIcon():
     *      метод возвращает изображение обьекта caterpillar
     */

    @Override
    public String getIcon() {
        return Color.MAGENTA_BOLD + "\uD83D\uDC1B" + Color.RESET;
    }

    /**
     *  Алгоритм eat():
     *      метод реализует поведение травоядного по поеданию самого себя ради сокращения популяции
     */

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island
        if (list.contains(Plants.plant.getPlantIcon())) { // Если список содержит caterpillar
            list.remove(Caterpillar.caterpillar.getIcon()); // Удаляем caterpillar из списка list
            System.out.println(getClass().getSimpleName() + " eat");
            //move(list); // caterpillar двигается дальше
        }
    }

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

    }

    /**
     *  Алгоритм multiply():
     *      метод создает caterpillar в списке массива island
     */

    @Override
    public void multiply() {
        setCurrentPosition(Main.random.nextInt(Island.cellMaxSize)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(AnimalType.CATERPILLAR.ordinal()).getIcon(), getCurrentPosition()); // Создаем caterpillar через AnimalFactory
        System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " multiply" + Color.RESET);
        //StatisticData.herbivoresBornCount++;
    }

    @Override
    public void toDie() {

    }
}
