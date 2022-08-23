package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Board.Board;
import Main.Main;

public class Rabbit extends Herbivores {

    public static Rabbit rabbit = new Rabbit();

    public Rabbit() {
        super.setWeight(2);
        super.setMaxValueOnBoard(150);
        super.setSpeed(2);
        super.setFoolSaturation(0.45);

    }
    @Override
    public void eat() {
        for (int i = 0; i < Board.list0000.size(); i++) {
            if (Board.list0000.get(i) instanceof Plants) {
                Board.list0000.set(i, null);
                Board.list0000.remove(null);
                System.out.println("Rabbit eat");
            } else {
                rabbit.setFoolSaturation(0.0);
                Board.list0000.remove(rabbit);
            }
        }
    }

    @Override
    public void move() {
        for (int i = 0; i < Board.list0000.size(); i++) {
            if (Board.list0000.get(i) instanceof Herbivores) {
                Board.list0000.set(i, null);
                Board.list0000.remove(null);
                Board.list0001.add(Main.factory.createAnimal(8));
                System.out.println("Rabbit move");
            } else {
                super.setFoolSaturation(0.45 - 0.15);
            }
        }
    }

    @Override
    public void multiply() {

    }

    @Override
    public void toDie() {

    }
}
