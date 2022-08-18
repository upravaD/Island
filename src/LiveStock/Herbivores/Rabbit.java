package LiveStock.Herbivores;

import LiveStock.Animal;
import LiveStock.Plants;
import Main.Board;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Rabbit extends Animal {

    public String simpleName = Rabbit.class.getSimpleName();
    public static Map<String, Double> rabbitMapValue = new HashMap<>();
    int countOfRabbits = 1;

    public Rabbit() {
        super.setWeight(2);
        super.setMaxValueOnBoard(150);
        super.setSpeed(2);
        super.setFoolSaturation(0.45);
        System.out.println(simpleName);
    }

    public String getSimpleNameName() {
        return simpleName;
    }
    public void bornRabbit() {
        rabbitMapValue.put(simpleName, Rabbit.super.getFoolSaturation());
        Board.boardListValue.add(1, Rabbit.rabbitMapValue);
    }
    @Override
    public void eat() {

    }
    @Override
    public void move() {

    }
    @Override
    public void multiply() {

    }
    @Override
    public void toDie() {

    }

    @Override
    public void run() {
        ScheduledExecutorService executorServicePlants = Executors.newScheduledThreadPool(4);
        executorServicePlants.scheduleAtFixedRate(this::bornRabbit, 0, 1000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            executorServicePlants.shutdown();
        }
    }
}
