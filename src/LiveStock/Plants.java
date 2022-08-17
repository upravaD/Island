package LiveStock;

import Main.Board;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Plants extends Thread {

    public String name = String.valueOf(Plants.class);
    private int weight;
    private final int maxPlantsOnBoard;

    public Plants() {
        this.weight = 1;
        this.maxPlantsOnBoard = 200;
        System.out.println(name);
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

    private void bornPlants() {

        //Популяция растений в ячейке
        Board.boardValue.add(0, getWeight());
        while (!interrupted()) {
            ListIterator<Object> iterator = Board.boardValue.listIterator();
            while (iterator.hasNext()) {
                int next = (int) iterator.next();
                iterator.set(this.weight += 2);
                if (next >= maxPlantsOnBoard) {
                    setWeight(1);
                    iterator.set(this.weight);
                }
            }

            //Добавление на карту
            Random random = new Random();
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            Board.island2[x][y] = Arrays.toString(Board.boardValue.toArray());

            //вывод на экран
            for (int i = 0; i < Board.island2[x].length; i++) {
                for (int j = 0; j < Board.island2[y].length; j++) {
                    System.out.print("  " + Board.island2[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void start() {

        ScheduledExecutorService executorServicePlants = Executors.newScheduledThreadPool(4);
        executorServicePlants.scheduleAtFixedRate(this::bornPlants, 0, 1000, TimeUnit.MILLISECONDS);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
