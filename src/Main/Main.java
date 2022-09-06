package Main;

import LiveStock.Animal.AnimalFactory;
import LiveStock.Animal.AnimalType;
import Main.Island.Cell;
import Main.Island.Island;
import Main.Settings.Color;
import Main.Settings.Initialize;
import Main.Settings.IslandSettings;

import java.util.Random;

public class Main {

    public static Random random = new Random();
    public static AnimalFactory factory = new AnimalFactory();

    public static void main(String[] args) {

        {System.out.println(Color.GREEN_BRIGHT + "\uD83C\uDF34\uD83C\uDF34\uD83C\uDF34 ISLAND \uD83C\uDF34\uD83C\uDF34\uD83C\uDF34" + Color.RESET);}

        IslandSettings islandSettings = new IslandSettings();
        islandSettings.userChoice();

        Initialize init = new Initialize();
        init.start();

    }
}
