package Main.Settings;

import LiveStock.Animal.Animal;
import LiveStock.Animal.AnimalType;
import LiveStock.Herbivores.Herbivores;
import LiveStock.Plants;

import LiveStock.Predators.Bear;
import LiveStock.Predators.Predator;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Класс реализации потоков
public class Initialize extends Thread {

    public static int daysNumber = 10 * 1000; // Количество дней симуляции
    public int dayDuration = daysNumber/10; // Продолжительность одного дня симуляции

    public Initialize() {
        System.out.println(Initialize.class.getSimpleName() + " start");
    }

    @Override
    public void run() { // Запуск потока

        Animal[] animalArray = new Animal[Island.island.length]; // Массив созданных обьктов Animal

        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i] = Main.factory.multiplyAnimal(Main.random.nextInt(AnimalType.values().length-5));
        }
        for (int i = 0; i < animalArray.length/3; i++) {
            animalArray[i] = Main.factory.multiplyAnimal(10);
        }
        printDays(animalArray);
    }

    public void printDays(Animal[] animals) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(() -> Plants.plant.multiply(),
                0, dayDuration/3, TimeUnit.MILLISECONDS);

        for (Animal value : animals) {
            if (value instanceof Herbivores herbivores) {
                executorService.scheduleAtFixedRate(() -> herbivores.eat
                                (Objects.requireNonNull(CellPosition.getCellList(herbivores.getCurrentPosition()))),
                        1000, dayDuration/herbivores.getSpeed(), TimeUnit.MILLISECONDS);
            }
            if (value instanceof Predator predator) {
                executorService.scheduleAtFixedRate(() -> predator.eat
                                (Objects.requireNonNull(CellPosition.getCellList(predator.getCurrentPosition()))),
                        2000, dayDuration/Bear.bear.getSpeed(), TimeUnit.MILLISECONDS);
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
        // Алгоритм:
        // метод выводит в консоль инициализированный массив island
        // через определенный промежуток времени равный dayDuration
        // и определенное кол-во раз равное daysNumber
    }
}
