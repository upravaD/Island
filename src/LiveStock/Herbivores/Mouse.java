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

public class Mouse extends Herbivores {

    public static Mouse mouse = new Mouse();

    public Mouse() {
        super.setWeight(0.05);
        super.setMaxValueOnBoard(500);
        super.setSpeed(1);
        super.setMaxFoodSaturation(0.01);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    /**
     *  Алгоритм getIcon():
     *      метод возвращает изображение обьекта mouse
     */

    @Override
    public String getIcon() {
        return Color.BLUE_BOLD + "\uD83D\uDC01" + Color.RESET;
    }

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Plants.plant.getPlantIcon())) { // Если список содержит plant

            list.remove(Plants.plant.getPlantIcon()); // Удаляем plant из списка list
            setFoodSaturation(getFoodSaturation() + Plants.plant.weight/1000); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.001)
            System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект mouse
                    setFoodSaturation(getMaxFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.plantEatCount++;
            System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " eat " + StatisticData.plantEatCount + " times" + Color.RESET);
            move(list); // mouse двигается дальше

        } else { //Если список не содержит plant

            setFoodSaturation(getFoodSaturation() - Plants.plant.weight/1000); // Уменьшаем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.001)
            System.out.println(getClass().getSimpleName() + " not eat");
            if (getFoodSaturation() < 0.001) { // Если значение foodSaturation меньше 0.001
                list.remove(getIcon()); // Удаляем mouse из списка list
                if (getFoodSaturation() > -0.001) {
                    StatisticData.herbivoresDeadCount++;
                    System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " dead" + Color.RESET);
                }
            }
            move(list); // mouse двигается дальше
            if (getFoodSaturation() > -0.001)
            System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }

    /**
     *  Алгоритм move():
     *      метод меняет позицию mouse между списками ячеек массива island в произвольном порядке или на первую ячейку массива island
     */

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        int index = getCurrentPosition(); // Текущая позиция в массиве island

        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если mouse есть в списке list
                list.remove(list.get(i)); // Удаляем mouse из списка list

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
     *      метод создает mouse в списке массива island
     */

    @Override
    public void multiply() {
        setCurrentPosition(Main.random.nextInt(Island.cellMaxSize)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(AnimalType.MOUSE.ordinal()).getIcon(), getCurrentPosition()); // Создаем mouse через AnimalFactory
        StatisticData.herbivoresBornCount++; // Статистика
        System.out.println(Color.YELLOW_UNDERLINED + getClass().getSimpleName() + " multiply" + Color.RESET);
    }

    @Override
    public void toDie() {

    }
}
