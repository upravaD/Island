package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;
import Main.Settings.StatisticData;

import java.util.*;

public class Rabbit extends Herbivores {

    public static Rabbit rabbit = new Rabbit();

    public Rabbit() {
        super.setWeight(2);
        super.setMaxValueOnBoard(150);
        super.setSpeed(2);
        super.setFoodSaturation(0.2);
        super.setMaxFoodSaturation(0.45);
    }

    @Override
    public String getIcon() {
        return "🐇";
        // Алгоритм:
        // метод возвращает изображение обьекта rabbit
    }

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Plants.plant.getPlantIcon())) { // Если список содержит plant

            list.remove(Plants.plant.getPlantIcon()); // Удаляем plant из списка list
            super.setFoodSaturation(getFoodSaturation() + Plants.plant.weight / 20); // Увеличиваем значение насыщения foodSaturation
            System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextInt(100) < 50) {
                    multiply(); // Создаем еще один обьект rabbit
                    super.setFoodSaturation(0.2); // Устанавливаем новое значение foodSaturation
                }
            }

            StatisticData.plantEatCount++; // Статистика
            System.out.println(this.getClass().getSimpleName() + " eat " + StatisticData.plantEatCount + " times");
            move(list); // rabbit двигается дальше

        } else { //Если список не содержит plant

            super.setFoodSaturation(getFoodSaturation() - Plants.plant.weight / 20); // Уменьшаем значение насыщения foodSaturation
            System.out.println(this.getClass().getSimpleName() + " not eat");
            if (getFoodSaturation() < 0.01) { // Если значение foodSaturation меньше 0.01
                list.remove(getIcon()); // Удаляем rabbit из списка list
                System.out.println(this.getClass().getSimpleName() + " dead");
            }
            move(list); // rabbit двигается дальше

            System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        int index = this.getCurrentPosition(); // Текущая позиция в массиве island
        System.out.println(index);
        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если rabbit есть в списке list
                list.remove(list.get(i)); // Удаляем rabbit из списка list

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
        // Алгоритм:
        // метод меняет позицию rabbit между списками ячеек массива island в произвольном порядке или на первую ячейку массива island
    }

    @Override
    public void multiply() {
        this.setCurrentPosition(Main.random.nextInt(9)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(8).getIcon(), this.getCurrentPosition()); // Создаем rabbit через AnimalFactory
        System.out.println(this.getClass().getSimpleName() + " multiply");
        // Алгоритм:
        // метод создает rabbit в списке массива island
    }

    @Override
    public void toDie() {

    }
}
