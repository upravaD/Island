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

public class Boa extends Predator {

    public static Boa boa = new Boa();

    public Boa() {
        super.setWeight(15);
        super.setMaxValueOnBoard(30);
        super.setSpeed(1);
        super.setMaxFoodSaturation(3);
        super.setFoodSaturation(getMaxFoodSaturation()/2);
    }

    /**
     * Алгоритм getIcon():
     * метод возвращает изображение обьекта boa
     */

    @Override
    public String getIcon() {
        return "\uD83D\uDC0D";
    }

    /**
     * Алгоритм eat():
     * метод реализует поведение хищника по поеданию животных
     */

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Fox.fox.getIcon()) && Main.random.nextInt(101) < 15) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Fox.fox.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Fox.fox.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект boa
                    super.setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //boa двигается дальше
        }
        else if (list.contains(Rabbit.rabbit.getIcon()) && Main.random.nextInt(101) < 20) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Rabbit.rabbit.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Rabbit.rabbit.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект boa
                    super.setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); // boa двигается дальше
        }
        else if (list.contains(Mouse.mouse.getIcon()) && Main.random.nextInt(101) < 40) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Mouse.mouse.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Mouse.mouse.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект boa
                    super.setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //boa двигается дальше
        }
        else if (list.contains(Duck.duck.getIcon()) && Main.random.nextInt(101) < 10) { // Если list содержит обьект Herbivores то с определленой вероятностью

            list.remove(Duck.duck.getIcon()); // Удаляем animal из списка list
            super.setFoodSaturation(getFoodSaturation() + Duck.duck.getWeight()); // Увеличиваем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект boa
                    super.setFoodSaturation(getFoodSaturation()/2); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.herbivoresDeadCount++; // Статистика
            StatisticData.predatorEatingCount++; // Статистика
            System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " eat " + StatisticData.predatorEatingCount + " times" + Color.RESET);
            move(list); //boa двигается дальше
        }
        else { //Если список не содержит animal

            super.setFoodSaturation(getFoodSaturation() - getWeight()/30); // Уменьшаем значение насыщения foodSaturation
            if (getFoodSaturation() > -0.01)
                System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " not eat" + Color.RESET);
            if (getFoodSaturation() < 0.01) { // Если значение foodSaturation меньше 0.01
                list.remove(getIcon()); // Удаляем boa из списка list
                if (getFoodSaturation() > -0.01) {
                    StatisticData.predatorDeadCount++; // Статистика
                    System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " dead" + Color.RESET);
                }
            }
            move(list); // boa двигается дальше
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

            if (list.get(i).equals(getIcon())) { // Если boa есть в списке list
                list.remove(list.get(i)); // Удаляем boa из списка list

                if (index == Island.cellMaxSize-1) { // Если текущая позиция равна последней ячейке массива island
                    CellPosition.changeCell(getIcon(), 0); // Меняем текущую позицию на первую ячейку массива island
                    System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " move in the begin" + Color.RESET);
                    this.setCurrentPosition(0); // Сохраняем значение текущей позиции

                } else { // В любом другом случае
                    index = Main.random.nextInt(Island.cellMaxSize); // Устанавливаем рандомный индекс
                    CellPosition.changeCell(getIcon(), index); // Меняем текущую позицию на рандомную ячейку массива island
                    System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " random move" + Color.RESET);
                    this.setCurrentPosition(index); // Сохраняем значение текущей позиции
                }
            }
        }
    }

    /**
     * Алгоритм multiply():
     * метод создает boa в списке массива island
     */

    @Override
    public void multiply() {
        this.setCurrentPosition(Main.random.nextInt(Island.cellMaxSize)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(AnimalType.BOA.ordinal()).getIcon(), this.getCurrentPosition()); // Создаем boa через AnimalFactory
        StatisticData.predatorBornCount++; // Статистика
        eat(Objects.requireNonNull(CellPosition.getCellList(this.getCurrentPosition())));
        System.out.println(Color.RED_UNDERLINED + this.getClass().getSimpleName() + " multiply" + Color.RESET);
    }

    @Override
    public void toDie() {

    }
}
