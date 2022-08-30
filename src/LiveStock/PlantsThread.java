package LiveStock;

import Main.Island.Island;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Класс устаревший существует как черновик
public class PlantsThread extends Thread {

    public String name = PlantsThread.class.getSimpleName();
    public static Map<String, Double> plantsMapValue = new HashMap<>();
    private Double weight;
    private final int maxPlantsOnBoard;

    public PlantsThread() {
        this.weight = 1.0;
        this.maxPlantsOnBoard = 200;
        System.out.println(name);
    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public int getMaxPlantsOnBoard() {
        return maxPlantsOnBoard;
    }

    private void bornPlants() {
        Random random = new Random();
        plantsMapValue.put(name, getWeight());
        Island.boardListValue.add(0, PlantsThread.plantsMapValue);
        boolean cancel = false;

        while (!cancel) {

            //Популяция растений в ячейке
            if (plantsMapValue.get(name) >= maxPlantsOnBoard) {
                plantsMapValue.replace(name, getWeight(), 1.0);
                setWeight(1.0);
            }
            plantsMapValue.replace(name, getWeight(), weight += random.nextInt(5));

            //Добавление List на карту
            System.out.println("Картина на " + Island.day + " день:");
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            //Board.island[x][y] = Arrays.toString(plantsMapValue.entrySet().toArray());
            Island.island[x][y] = Arrays.toString(Island.boardListValue.toArray());
            Island.printBoard();

            //Период обновления
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                cancel = true;
            }
        }
    }

    @Override
    public void run() {
        ScheduledExecutorService executorServicePlants = Executors.newScheduledThreadPool(4);
        executorServicePlants.scheduleAtFixedRate(this::bornPlants, 0, 1000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            executorServicePlants.shutdown();
        }

    }
}
