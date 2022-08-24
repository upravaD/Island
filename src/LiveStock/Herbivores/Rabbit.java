package LiveStock.Herbivores;

import LiveStock.Plants;
import Main.Board.CellPosition;
import Main.Main;

import java.util.List;

public class Rabbit extends Herbivores {

    public static Rabbit rabbit = new Rabbit();

    public Rabbit() {
        super.setWeight(2);
        super.setMaxValueOnBoard(150);
        super.setSpeed(2);
        super.setFoolSaturation(0.45);

    }
    @Override
    public void eat(List<Object> list) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Plants) {
                list.set(i, null);
                list.remove(null);
                System.out.println("Rabbit eat");
            }
        }
    }

    @Override
    public void move(List<Object> list) {
        int index = CellPosition.cellIndex(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Herbivores) {
                list.set(i, null);
                list.remove(null);
                CellPosition.changeCell(rabbit, index);
                System.out.println("Rabbit move");
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
