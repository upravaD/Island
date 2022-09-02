package Main.Settings;

import LiveStock.Animal.AnimalFactory;
import LiveStock.Animal.Animal;
import LiveStock.Herbivores.Herbivores;
import LiveStock.Herbivores.Rabbit;
import LiveStock.Plants;
import Main.Island.CellPosition;
import Main.Island.Island;
import Main.Main;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Класс реализации потоков
public class Initialize extends Thread {

    public static int daysNumber = 10 * 1000; // Количество дней симуляции
    public int dayDuration = 1000; // Продолжительность одного дня симуляции

    public Initialize() {
        System.out.println(Initialize.class.getSimpleName() + " start");
    }

    @Override
    public void run() {
        Animal[] animalArray = new Animal[Island.island.length];
        for (int i = 0; i < animalArray.length; i++) {
            animalArray[i] = Main.factory.multiplyAnimal(Main.random.nextInt(0,10));
            //animalArray[i] = Main.factory.multiplyAnimal(8);

        }
        printDays(animalArray);
    }

    public void printDays(Animal[] animal) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(() -> Plants.plant.multiply(),
                0, dayDuration/2, TimeUnit.MILLISECONDS);

        for (Animal value : animal) {
            if (value instanceof Herbivores herbivores) {
                executorService.scheduleAtFixedRate(() -> herbivores.eat
                                (Objects.requireNonNull(CellPosition.getCellList(herbivores.getCurrentPosition()))),
                        0, dayDuration, TimeUnit.MILLISECONDS);
            }
        }

        executorService.scheduleAtFixedRate(Island::printBoard,
                0, dayDuration, TimeUnit.MILLISECONDS);

        try {
            Thread.sleep(daysNumber);
            executorService.shutdown(); // Завершение потока
            System.out.println("printDays shutdown");
            StatisticData.printData(); // Вывод статистики
        } catch (InterruptedException e) {
            System.out.println("Interrupt ERROR");
            e.printStackTrace();
        }
        // Алгоритм:
        // метод выводит в консоль инициализированный массив island
        // через определенный промежуток времени равный dayDuration
        // и определенное кол-во раз равное daysNumber
    }
}
