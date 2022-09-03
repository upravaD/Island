package Main;

import LiveStock.Animal.AnimalFactory;
import Main.Settings.Initialize;

import java.util.Random;

public class Main {

    public static Random random = new Random();
    public static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {
        Initialize init = new Initialize();
        init.start();
    }
}
