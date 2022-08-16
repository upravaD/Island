package Main;

import LiveStock.Plants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Initialize implements Runnable {

    Random random = new Random();
    int x = random.nextInt(3);
    int y = random.nextInt(3);

    public Initialize() {
        Plants plants = new Plants();
        plants.run();
        Board.boardValue.add(plants.getWeight());
    }

    @Override
    public void run() {
        Board.island[0] = Board.boardValue.toArray();
        System.out.println(Arrays.deepToString(Board.island));
    }
//    @Override
//    public void run() {
//        int value = (int) (Math.random() * 1000);
//        Board.boardValue.add(value);
//        Board.island[x] = Board.boardValue.toArray();
//        System.out.println(Arrays.deepToString(Board.island));
//        //Board.boardValue.set(x, value/2);
//        //Board.island[x] = null;
//        //value += (int) (Math.random() * 1000);
//        x += 1;
//
//    }

}
