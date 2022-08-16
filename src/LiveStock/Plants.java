package LiveStock;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Plants implements Runnable {

    private int weight;
    private int maxPlantsOnBoard;

    public Plants() {
        this.weight = 1;
        this.maxPlantsOnBoard = 200;
        this.run();
    }
    public Plants toBorn() {
        return new Plants();
    }
    public void toDie() {
        System.out.println("Plant die");
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxPlantsOnBoard() {
        return maxPlantsOnBoard;
    }
    public void setMaxPlantsOnBoard(int maxPlantsOnBoard) {
        this.maxPlantsOnBoard = maxPlantsOnBoard;
    }

    @Override
    public void run() {
        ScheduledExecutorService executorServicePlants = Executors.newScheduledThreadPool(4);
        executorServicePlants.scheduleAtFixedRate(() -> this.weight+=1, 0,100, TimeUnit.MILLISECONDS);
        if (getWeight() > getMaxPlantsOnBoard())
            executorServicePlants.shutdown();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getWeight());
//        try {
//            Thread.sleep(3000);
//            executorServicePlants.shutdown();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
