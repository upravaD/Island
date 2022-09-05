package LiveStock.Predators;

import LiveStock.Animal.AnimalType;
import LiveStock.Herbivores.*;
import LiveStock.Plants;
import Main.Island.Cell;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;
import Main.Settings.Color;
import Main.Settings.StatisticData;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bear extends Predator {

    public static Bear bear = new Bear();

    public Bear() {
        super.setWeight(500);
        super.setMaxValueOnBoard(5);
        super.setSpeed(2);
        super.setMaxFoodSaturation(800);
        super.setFoodSaturation(getMaxFoodSaturation() / 4);
    }

    /**
     * Алгоритм getIcon():
     * метод возвращает изображение обьекта bear
     */

    @Override
    public String getIcon() {
        return Color.YELLOW + "\uD83D\uDC3B" + Color.RESET;
    }

    /**
     * Алгоритм eat():
     * метод реализует поведение хищника по поеданию животных
     */

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Horse.horse.getIcon()) && Main.random.nextInt(101) < 40) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Horse.horse.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Horse.horse.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Deer.deer.getIcon()) && Main.random.nextInt(101) < 60) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Deer.deer.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Deer.deer.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Rabbit.rabbit.getIcon()) && Main.random.nextInt(101) < 80) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Rabbit.rabbit.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Rabbit.rabbit.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Mouse.mouse.getIcon()) && Main.random.nextInt(101) < 90) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Mouse.mouse.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Mouse.mouse.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Goat.goat.getIcon()) && Main.random.nextInt(101) < 70) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Goat.goat.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Goat.goat.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Sheep.sheep.getIcon()) && Main.random.nextInt(101) < 65) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Sheep.sheep.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Sheep.sheep.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Boar.boar.getIcon()) && Main.random.nextInt(101) < 65) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Boar.boar.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Boar.boar.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Buffalo.buffalo.getIcon()) && Main.random.nextInt(101) < 20) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Buffalo.buffalo.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Buffalo.buffalo.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше

        }
        else if (list.contains(Duck.duck.getIcon()) && Main.random.nextInt(101) < 10) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Duck.duck.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Duck.duck.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше
        }
        else if (list.contains(Boa.boa.getIcon()) && Main.random.nextInt(101) < 80) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Boa.boa.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Boa.boa.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект bear
                    super.setFoodSaturation(getFoodSaturation() / 2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //bear двигается дальше
        }
        else { //Если список не содержит animal

            super.setFoodSaturation(getFoodSaturation() - getWeight()/20); // Уменьшаем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " not eat" + Color.RESET);
            if (getFoodSaturation() < 0.01) { // Если значение foodSaturation меньше 0.01
                list.remove(getIcon()); // Удаляем bear из списка list
                if (getFoodSaturation() > -0.01) {
                    StatisticData.predatorDeadCount++; // Статистика
                    System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " dead" + Color.RESET);
                }
            }
            move(list); // bear двигается дальше
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }

    /**
     * Алгоритм move():
     * метод реализует поведение хищника по передвижению между локациями
     */

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        //System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " = " + this.getCurrentPosition() + Color.RESET);

        int index = this.getCurrentPosition(); // Текущая позиция в массиве island

        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если bear есть в списке list
                list.remove(list.get(i)); // Удаляем bear из списка list

                if (index == Cell.values().length-1) { // Если текущая позиция равна последней ячейке массива island
                    CellPosition.changeCell(getIcon(), 0); // Меняем текущую позицию на первую ячейку массива island
                    System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " move in the begin" + Color.RESET);
                    this.setCurrentPosition(0); // Сохраняем значение текущей позиции

                } else { // В любом другом случае
                    index = Main.random.nextInt(Cell.values().length); // Устанавливаем рандомный индекс
                    CellPosition.changeCell(getIcon(), index); // Меняем текущую позицию на рандомную ячейку массива island
                    System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " random move" + Color.RESET);
                    this.setCurrentPosition(index); // Сохраняем значение текущей позиции
                }
            }
        }
    }

    /**
     * Алгоритм multiply():
     * метод создает bear в списке массива island
     */

    @Override
    public void multiply() {
        this.setCurrentPosition(Main.random.nextInt(Cell.values().length)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(AnimalType.BEAR.ordinal()).getIcon(), this.getCurrentPosition()); // Создаем bear через AnimalFactory
        StatisticData.predatorBornCount++; // Статистика
        System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " multiply" + Color.RESET);
    }

    @Override
    public void toDie() {

    }
}
