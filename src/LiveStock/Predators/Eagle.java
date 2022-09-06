package LiveStock.Predators;

import LiveStock.Animal.AnimalType;
import LiveStock.Herbivores.Duck;
import LiveStock.Herbivores.Mouse;
import LiveStock.Herbivores.Rabbit;
import Main.Island.Cell;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;
import Main.Settings.Color;
import Main.Settings.StatisticData;

import java.util.List;
import java.util.Objects;

public class Eagle extends Predator {

    public static Eagle eagle = new Eagle();

    public Eagle() {
        super.setWeight(6);
        super.setMaxValueOnBoard(20);
        super.setSpeed(3);
        super.setMaxFoodSaturation(1);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    /**
     * Алгоритм getIcon():
     * метод возвращает изображение обьекта eagle
     */

    @Override
    public String getIcon() {
        return "\uD83E\uDD85";
    }

    /**
     * Алгоритм eat():
     * метод реализует поведение хищника по поеданию животных
     */

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Fox.fox.getIcon()) && Main.random.nextInt(101) < 10) { // Если list содержит обьект Herbivores то с определленой вероятностью...

            list.remove(Fox.fox.getIcon()); // Удаляем animal из списка list
            setFoodSaturation(getFoodSaturation() + Fox.fox.getWeight()/5); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.0001)
                System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект eagle
                    setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //eagle двигается дальше
        }
        else if (list.contains(Rabbit.rabbit.getIcon()) && Main.random.nextInt(101) < 90) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Rabbit.rabbit.getIcon()); // Удаляем animal из списка list
            setFoodSaturation(getFoodSaturation() + Rabbit.rabbit.getWeight()/5); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.0001)
                System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект eagle
                    setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //eagle двигается дальше
        }
        else if (list.contains(Mouse.mouse.getIcon()) && Main.random.nextInt(101) < 90) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Mouse.mouse.getIcon()); // Удаляем animal из списка list
            setFoodSaturation(getFoodSaturation() + Mouse.mouse.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.0001)
                System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект eagle
                    setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //eagle двигается дальше
        }
        else if (list.contains(Duck.duck.getIcon()) && Main.random.nextInt(101) < 80) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Duck.duck.getIcon()); // Удаляем animal из списка list
            setFoodSaturation(getFoodSaturation() + Duck.duck.getWeight()/5); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.0001)
                System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект eagle
                    setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //eagle двигается дальше
        }
        else { //Если список не содержит animal

            setFoodSaturation(getFoodSaturation() - getWeight()/30); // Уменьшаем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.0001)
                System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " not eat" + Color.RESET);
            if (getFoodSaturation() < 0.0001) { // Если значение foodSaturation меньше 0.01
                list.remove(getIcon()); // Удаляем eagle из списка list
                if (getFoodSaturation() > -0.0001) {
                    StatisticData.predatorDeadCount++; // Статистика
                    System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " dead" + Color.RESET);
                }
            }
            move(list); // eagle двигается дальше
            if (getFoodSaturation() > -0.0001)
                System.out.println(getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }
    /**
     * Алгоритм move():
     * метод реализует поведение хищника по передвижению между локациями
     */

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        //System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " = " + this.getCurrentPosition() + Color.RESET);

        int index = getCurrentPosition(); // Текущая позиция в массиве island

        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если eagle есть в списке list
                list.remove(list.get(i)); // Удаляем eagle из списка list

                if (index == Island.cellMaxSize-1) { // Если текущая позиция равна последней ячейке массива island
                    CellPosition.changeCell(getIcon(), 0); // Меняем текущую позицию на первую ячейку массива island
                    System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " move in the begin" + Color.RESET);
                    setCurrentPosition(0); // Сохраняем значение текущей позиции

                } else { // В любом другом случае
                    index = Main.random.nextInt(Island.cellMaxSize); // Устанавливаем рандомный индекс
                    CellPosition.changeCell(getIcon(), index); // Меняем текущую позицию на рандомную ячейку массива island
                    System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " random move" + Color.RESET);
                    setCurrentPosition(index); // Сохраняем значение текущей позиции
                }
            }
        }
    }

    /**
     * Алгоритм multiply():
     * метод создает eagle в списке массива island
     */

    @Override
    public void multiply() {
        setCurrentPosition(Main.random.nextInt(Island.cellMaxSize)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(AnimalType.EAGLE.ordinal()).getIcon(), getCurrentPosition()); // Создаем eagle через AnimalFactory
        StatisticData.predatorBornCount++; // Статистика
        System.out.println(Color.RED_UNDERLINED + getClass().getSimpleName() + " multiply" + Color.RESET);
    }

    @Override
    public void toDie() {

    }
}
