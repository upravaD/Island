package LiveStock.Herbivores;

import java.util.List;

public class Sheep extends Herbivores {

    public Sheep() {
        super.setWeight(70);
        super.setMaxValueOnBoard(140);
        super.setSpeed(3);
        super.setFoolSaturation(15);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }
}
