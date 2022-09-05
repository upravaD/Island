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

public class Buffalo extends Herbivores {

    public static Buffalo buffalo = new Buffalo();

    public Buffalo() {
        super.setWeight(700);
        super.setMaxValueOnBoard(10);
        super.setSpeed(3);
        super.setMaxFoodSaturation(100);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    /**
     *  Алгоритм getIcon():
     *      метод возвращает изображение обьекта buffalo
     */

    @Override
    public String getIcon() {
        return Color.RED_BOLD_BRIGHT + "\uD83D\uDC03" + Color.RESET;
    }

    /**
     *  Алгоритм eat():
     *      метод реализует поведение травоядного по поеданию растений
     */

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Plants.plant.getPlantIcon())) { // Если список содержит plant

            list.remove(Plants.plant.getPlantIcon()); // Удаляем plant из списка list
            setFoodSaturation(getFoodSaturation() + Plants.plant.weight); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
            System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект buffalo
                    setFoodSaturation(30); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.plantEatCount++; // Статистика
            System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " eat " + StatisticData.plantEatCount + " times" + Color.RESET);
            move(list); // buffalo двигается дальше

        } else { //Если список не содержит plant

            setFoodSaturation(getFoodSaturation() - Plants.plant.weight); // Уменьшаем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
            System.out.println(getClass().getSimpleName() + " not eat");
            if (getFoodSaturation() < 0.01) { // Если значение foodSaturation меньше 0.01
                list.remove(getIcon()); // Удаляем buffalo из списка list
                if (getFoodSaturation() > -0.01) {
                    StatisticData.herbivoresDeadCount++; // Статистика
                    System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " dead" + Color.RESET);
                }
            }
            move(list); // buffalo двигается дальше
            if (getFoodSaturation() > -0.01)
            System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }

    /**
     *  Алгоритм move():
     *      метод меняет позицию buffalo между списками ячеек массива island в произвольном порядке или на первую ячейку массива island
     */

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        int index = getCurrentPosition(); // Текущая позиция в массиве island

        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если buffalo есть в списке list
                list.remove(list.get(i)); // Удаляем buffalo из списка list

                if (index == Island.cellMaxSize-1) { // Если текущая позиция равна последней ячейке массива island
                    CellPosition.changeCell(getIcon(), 0); // Меняем текущую позицию на первую ячейку массива island
                    System.out.println(getClass().getSimpleName() + " move in the begin");
                    setCurrentPosition(0); // Сохраняем значение текущей позиции

                } else { // В любом другом случае
                    index = Main.random.nextInt(Island.cellMaxSize); // Устанавливаем рандомный индекс
                    CellPosition.changeCell(getIcon(), index); // Меняем текущую позицию на рандомную ячейку массива island
                    System.out.println(getClass().getSimpleName() + " random move");
                    setCurrentPosition(index); // Сохраняем значение текущей позиции
                }
            }
        }
    }

    /**
     *  Алгоритм multiply():
     *      метод создает buffalo в списке массива island
     */

    @Override
    public void multiply() {
        setCurrentPosition(Main.random.nextInt(Island.cellMaxSize)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(AnimalType.BUFFALO.ordinal()).getIcon(), getCurrentPosition()); // Создаем buffalo через AnimalFactory
        StatisticData.herbivoresBornCount++; // Статистика
        System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " multiply"  + Color.RESET);
    }

    @Override
    public void toDie() {

    }
}
