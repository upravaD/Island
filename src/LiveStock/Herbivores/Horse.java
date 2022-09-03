package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Island.CellPosition;
import Main.Main;
import Main.Settings.Color;
import Main.Settings.StatisticData;

import java.util.List;

public class Horse extends Herbivores {

    public static Horse horse = new Horse();

    public Horse() {
        super.setWeight(400);
        super.setMaxValueOnBoard(20);
        super.setSpeed(4);
        super.setMaxFoodSaturation(60);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    /**
     *  Алгоритм getIcon():
     *      метод возвращает изображение обьекта horse
     */

    @Override
    public String getIcon() {
        return Color.YELLOW_BOLD + "\uD83D\uDC0E" + Color.RESET;
    }

    /**
     *  Алгоритм eat():
     *      метод реализует поведение травоядного по поеданию растений
     */

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Plants.plant.getPlantIcon())) { // Если список содержит plant

            list.remove(Plants.plant.getPlantIcon()); // Удаляем plant из списка list
            super.setFoodSaturation(getFoodSaturation() + Plants.plant.weight); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
            System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект horse
                    super.setFoodSaturation(30); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.plantEatCount++; // Статистика
            System.out.println(Color.YELLOW_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.plantEatCount + " times" + Color.RESET);
            move(list); // horse двигается дальше

        } else { //Если список не содержит plant

            super.setFoodSaturation(getFoodSaturation() - Plants.plant.weight); // Уменьшаем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
            System.out.println(this.getClass().getSimpleName() + " not eat");
            if (getFoodSaturation() < 0.01) { // Если значение foodSaturation меньше 0.01
                list.remove(getIcon()); // Удаляем horse из списка list
                if (getFoodSaturation() > -0.01) {
                    StatisticData.herbivoresDeadCount++;
                    System.out.println(Color.YELLOW_UNDERLINED + this.getClass().getSimpleName() + " dead" + Color.RESET);
                }
            }
            move(list); // horse двигается дальше
            if (getFoodSaturation() > -0.01)
            System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }

    /**
     *  Алгоритм move():
     *      метод меняет позицию horse между списками ячеек массива island в произвольном порядке или на первую ячейку массива island
     */

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        int index = this.getCurrentPosition(); // Текущая позиция в массиве island

        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если horse есть в списке list
                list.remove(list.get(i)); // Удаляем horse из списка list

                if (index == 8) { // Если текущая позиция равна последней ячейке массива island
                    CellPosition.changeCell(getIcon(), 0); // Меняем текущую позицию на первую ячейку массива island
                    System.out.println(this.getClass().getSimpleName() + " move in the begin");
                    this.setCurrentPosition(0); // Сохраняем значение текущей позиции

                } else { // В любом другом случае
                    index = Main.random.nextInt(0, 9); // Устанавливаем рандомный индекс
                    CellPosition.changeCell(getIcon(), index); // Меняем текущую позицию на рандомную ячейку массива island
                    System.out.println(this.getClass().getSimpleName() + " random move");
                    this.setCurrentPosition(index); // Сохраняем значение текущей позиции
                }
            }
        }
    }

    /**
     *  Алгоритм multiply():
     *      метод создает horse в списке массива island
     */

    @Override
    public void multiply() {
        this.setCurrentPosition(Main.random.nextInt(9)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(6).getIcon(), this.getCurrentPosition()); // Создаем horse через AnimalFactory
        StatisticData.herbivoresBornCount++; // Статистика
        System.out.println(Color.YELLOW_UNDERLINED + this.getClass().getSimpleName() + " multiply" + Color.RESET);
    }

    @Override
    public void toDie() {

    }
}
