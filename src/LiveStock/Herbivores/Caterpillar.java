package LiveStock.Herbivores;

import java.util.List;

public class Caterpillar extends Herbivores {

    public Caterpillar() {
        super.setWeight(0.01);
        super.setMaxValueOnBoard(1000);
        super.setSpeed(0);
        super.setFoolSaturation(0);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return null;
    }
}
