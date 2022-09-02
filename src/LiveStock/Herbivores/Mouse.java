package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Island.CellPosition;
import Main.Main;
import Main.Settings.StatisticData;

import java.util.List;

public class Mouse extends Herbivores {

    public static Mouse mouse = new Mouse();

    public Mouse() {
        super.setWeight(0.05);
        super.setMaxValueOnBoard(500);
        super.setSpeed(1);
        super.setFoodSaturation(0.005);
        super.setMaxFoodSaturation(0.01);
    }

    @Override
    public String getIcon() {
        return "\uD83D\uDC01";
    }

    @Override
    public void eat(List<Object> list) { //Параметры: список ячейки массива island

        if (list.contains(Plants.plant.getPlantIcon())) { // Если список содержит plant

            list.remove(Plants.plant.getPlantIcon()); // Удаляем plant из списка list
            super.setFoodSaturation(getFoodSaturation() + Plants.plant.weight/1000); // Увеличиваем значение насыщения foodSaturation
            System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
            if (getFoodSaturation() > getMaxFoodSaturation()) { // Если значение foodSaturation больше максимального
                if (Main.random.nextBoolean()) {
                    multiply(); // Создаем еще один обьект mouse
                    super.setFoodSaturation(0.005); // Устанавливаем новое значение foodSaturation
                }
            }
            StatisticData.plantEatCount++;
            System.out.println(this.getClass().getSimpleName() + " eat " + StatisticData.plantEatCount + " times");
            move(list); // mouse двигается дальше

        } else { //Если список не содержит plant

            super.setFoodSaturation(getFoodSaturation() - Plants.plant.weight/1000); // Уменьшаем значение насыщения foodSaturation
            System.out.println(this.getClass().getSimpleName() + " not eat");
            move(list); // mouse двигается дальше
            if (getFoodSaturation() < 0.001) { // Если значение foodSaturation меньше 0.001
                list.remove(getIcon()); // Удаляем mouse из списка list
                if (getFoodSaturation() > -0.01)
                StatisticData.herbivoresDeadCount++;
                System.out.println(this.getClass().getSimpleName() + " dead");
            }
            System.out.println(this.getClass().getSimpleName() + " Saturation = " + getFoodSaturation());
        }
    }

    @Override
    public void move(List<Object> list) { //Параметры: список ячейки массива island

        int index = this.getCurrentPosition(); // Текущая позиция в массиве island

        for (int i = 0; i < list.size(); i++) { // Цикл по списку list

            if (list.get(i).equals(getIcon())) { // Если mouse есть в списке list
                list.remove(list.get(i)); // Удаляем mouse из списка list

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
        // метод меняет позицию mouse между списками ячеек массива island в произвольном порядке или на первую ячейку массива island
    }

    @Override
    public void multiply() {
        this.setCurrentPosition(Main.random.nextInt(9)); // Сохраняем рандомное значение текущей позиции
        CellPosition.changeCell(Main.factory.createAnimal(7).getIcon(), this.getCurrentPosition()); // Создаем mouse через AnimalFactory
        StatisticData.herbivoresBornCount++;
        System.out.println(this.getClass().getSimpleName() + " multiply");
        // Алгоритм:
        // метод создает mouse в списке массива island
    }
}
