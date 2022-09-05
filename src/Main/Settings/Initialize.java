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

    public static int daysNumber = islandDays * 1000; // Количество дней симуляции
    public int dayDuration = 1000; // Продолжительность одного дня симуляции

    public Initialize() {
        System.out.println("\n" + Initialize.class.getSimpleName() + " start\n");
    }

    @Override
    public void run() { // Запуск потока

        Animal[] animalArray = new Animal[Island.island.length]; // Массив созданных обьктов Animal

        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i] = Main.factory.multiplyAnimal
                            (Main.random.nextInt(AnimalType.values().length-5));
        }
        for (int i = 0; i < animalArray.length/3; i++) {
            animalArray[i] = Main.factory.multiplyAnimal(Main.random.nextInt(AnimalType.values().length-4, AnimalType.values().length));
        }
        printDays(animalArray);
    }

    public void printDays(Animal[] animalArray) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(() -> Plants.plant.multiply(),
                0, dayDuration/3, TimeUnit.MILLISECONDS);

        for (Animal value : animalArray) {
            if (value instanceof Herbivores herbivores) {
                executorService.scheduleAtFixedRate(() -> herbivores.eat
                                (Objects.requireNonNull(CellPosition.getCellList(herbivores.getCurrentPosition()))),
                        1000, dayDuration/herbivores.getSpeed(), TimeUnit.MILLISECONDS);
            }
            if (value instanceof Predator predator) {
                executorService.scheduleAtFixedRate(() -> predator.eat
                                (Objects.requireNonNull(CellPosition.getCellList(predator.getCurrentPosition()))),
                        1000, dayDuration/predator.getSpeed(), TimeUnit.MILLISECONDS);
            }
        }

        executorService.scheduleAtFixedRate(Island::printBoard,
                0, 1000, TimeUnit.MILLISECONDS);

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
        // Алгоритм:
        // метод выводит в консоль инициализированный массив island
        // через определенный промежуток времени равный dayDuration
        // и определенное кол-во раз равное daysNumber
    }
}
