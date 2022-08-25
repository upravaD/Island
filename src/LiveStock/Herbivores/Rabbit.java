package LiveStock.Herbivores;

import LiveStock.Animal.AnimalFactory;
import LiveStock.Plants;
import Main.Board.CellList;
import Main.Board.CellPosition;
import Main.Main;

import java.util.List;

import static Main.Board.Board.cell0000;

public class Rabbit extends Herbivores {

    public static Rabbit rabbit = new Rabbit();

    public Rabbit() {
        super.setWeight(2);
        super.setMaxValueOnBoard(150);
        super.setSpeed(2);
        super.setFoolSaturation(0.45);

    }
    @Override
    public String getIcon() {
        return "🐇";
    }

    @Override
    public void eat(List<Object> list) {
        int index = CellPosition.cellIndex(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Plants || list.get(i).equals(Plants.plant.getPlantIcon())) {
                list.set(i, null);
                list.remove(null);
                System.out.println("Rabbit eat");
            } else {
                System.out.println("Rabbit eat 2");
                //CellPosition.changeCell(rabbit.getIcon(), index+1);
            }
        }
    }

    @Override
    public void move(List<Object> list) {
        int index = CellPosition.cellIndex(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(rabbit.getIcon())) {
                list.remove(list.get(i));
                if (index == 8) {
                    CellPosition.changeCell(rabbit.getIcon(), 1);
                    System.out.println("Rabbit move 2");
                } else {
                    CellPosition.changeCell(rabbit.getIcon(), index+1);
                    System.out.println("Rabbit move");
                }
            }
        }
    }

    @Override
    public void multiply() {
        cell0000.add(Main.factory.createAnimal(8).getIcon());
    }

    @Override
    public void toDie() {

    }
}
