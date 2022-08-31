package LiveStock.Herbivores;

import java.util.List;

public class Deer extends Herbivores {

    public Deer() {
        super.setWeight(300);
        super.setMaxValueOnBoard(20);
        super.setSpeed(4);
        super.setFoodSaturation(50);
    }

    @Override
    public void eat(List<Object> list) {

    }

    @Override
    public void move(List<Object> list) {

    }

    @Override
    public String getIcon() {
        return "\uD83E\uDD8C";
    }
}
