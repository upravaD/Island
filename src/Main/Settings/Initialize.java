package Main.Settings;

import LiveStock.Animal.Animal;
import LiveStock.Animal.AnimalType;
import LiveStock.Herbivores.Herbivores;
import LiveStock.Plants;
import LiveStock.Predators.Predator;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static Main.Settings.IslandSettings.islandDays;

//Класс реализации потоков
public class Initialize extends Thread {

    public static Animal[] animalArray;

    public static int daysNumber = islandDays * 1000; // Количество дней симуляции
    public int dayDuration = 1000; // Продолжительность одного дня симуляции

    public Initialize() {
        System.out.println("\n" + Initialize.class.getSimpleName() + " start\n");
    }

    /**
     *    Запуск потока Initialize
     */

    @Override
    public void run() {

        animalArray = new Animal[Island.island.length]; // Массив созданных обьктов Animal

        for (int i = 0; i < animalArray.length; i++) { // Создание травоядных
            animalArray[i] = Main.factory.multiplyAnimal(Main.random.nextInt(AnimalType.values().length-5));
            //animalArray[i] = Main.factory.multiplyAnimal(AnimalType.RABBIT.ordinal());
        }
        for (int i = 0; i < animalArray.length/3; i++) { // Создание хищников
            animalArray[i] = Main.factory.multiplyAnimal(Main.random.nextInt(AnimalType.values().length-4, AnimalType.values().length));
            //animalArray[i] = Main.factory.multiplyAnimal(AnimalType.WOLF.ordinal());
        }

        // Тестовый цикл

//        while (islandDays > 0) {
//            Plants.plant.multiply();
//            Plants.plant.multiply();
//            Plants.plant.multiply();
//            for (int i = 0; i < animalArray.length; i++) {
//                if (animalArray[i] instanceof Herbivores herbivores) {
//                    if (herbivores.getFoodSaturation() < 0) animalArray[i] = null;
//                    herbivores.eat(Objects.requireNonNull(CellPosition.getCellList(herbivores.getCurrentPosition())));
//                }
//                if (animalArray[i] instanceof Predator predator) {
//                    if (predator.getFoodSaturation() < 0) animalArray[i] = null;
//                    predator.eat(Objects.requireNonNull(CellPosition.getCellList(predator.getCurrentPosition())));
//                }
//            }
//            Island.printBoard();
//            islandDays--;
//        }
//        StatisticData.printData();

        startExecutors(animalArray);
    }

    /**
     *  Алгоритм startExecutors(Animal[] animalArray):
     *      метод выводит в консоль инициализированный массив island
     *       через определенный промежуток времени равный dayDuration
     *        и определенное кол-во раз равное daysNumber
     */

    public void startExecutors(Animal[] animalArray) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(16);

        executorService.scheduleAtFixedRate(() -> Plants.plant.multiply(),
                0, dayDuration/3, TimeUnit.MILLISECONDS);

        for (Animal value : animalArray) {
            if (value instanceof Herbivores herbivores && value.getFoodSaturation() > 0.0001) {
                executorService.scheduleAtFixedRate(() -> herbivores.eat
                                (Objects.requireNonNull(CellPosition.getCellList(herbivores.getCurrentPosition()))),
                        100, dayDuration, TimeUnit.MILLISECONDS);
            }
            if (value instanceof Predator predator && value.getFoodSaturation() > 0.0001) {
                executorService.scheduleAtFixedRate(() -> predator.eat
                                (Objects.requireNonNull(CellPosition.getCellList(predator.getCurrentPosition()))),
                        100, dayDuration, TimeUnit.MILLISECONDS);
            }
        }

        executorService.scheduleAtFixedRate(Island::printBoard,
                0, dayDuration, TimeUnit.MILLISECONDS);

        try {
            Thread.sleep(daysNumber);
            executorService.shutdown(); // Завершение потока
            System.err.println("_______________________________");
            System.err.println(Color.RED_UNDERLINED + "| !!! SIMULATION COMPLETE !!! |" + Color.RESET);
            StatisticData.printData(); // Вывод статистики
        } catch (InterruptedException e) {
            System.err.println("Interrupt ERROR");
            e.printStackTrace();
        }
    }
}
