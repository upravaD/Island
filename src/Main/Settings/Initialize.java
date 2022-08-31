package Main.Settings;

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

    public String name = Initialize.class.getSimpleName();
    public int daysNumber = 10 * 1000; // Количество дней симуляции
    public int dayDuration = 1 * 1000; // Продолжительность одного дня симуляции

    public Initialize() {
        System.out.println(name + " start");
    }

    @Override
    public void run() {
        Rabbit.rabbit.multiply();
        printDays();
    }

    public void printDays() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(64);

        executorService.scheduleAtFixedRate(() -> Plants.plant.multiply(), 0, dayDuration-500, TimeUnit.MILLISECONDS);
        //executorService.scheduleAtFixedRate(() -> CellPosition.changeCell(Main.factory.createAnimal(Main.random.nextInt(3)).getIcon(), Main.random.nextInt(9)), 0, dayDuration, TimeUnit.MILLISECONDS);
        //Rabbit.rabbit.multiply();
        executorService.scheduleAtFixedRate(() -> Rabbit.rabbit.eat(Objects.requireNonNull(CellPosition.getCellList(Rabbit.rabbit.getCurrentPosition()))), 0, dayDuration, TimeUnit.MILLISECONDS);

        executorService.scheduleAtFixedRate(Island::printBoard, 0, dayDuration, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(daysNumber);
            executorService.shutdown(); // Завершение потока
            System.out.println("printDays shutdown");
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }

        // Алгоритм:
        // метод выводит в консоль инициализированный массив island
        // через определенный промежуток времени равный dayDuration
        // и определенное кол-во раз равное daysNumber
    }
}
